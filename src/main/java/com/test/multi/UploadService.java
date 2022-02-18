/**
 * Project:		MoRIS
 * Created on: 	2022-02-01
 *
 * @author FRIEDMACHER, Manuel
 */
package com.test.multi;

import java.util.concurrent.BlockingQueue;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class UploadService extends Service<Void> {

    @Override
    protected Task<Void> createTask() {
        
        ContentHandler ch = ContentHandler.getInstance();
        BlockingQueue<String> blockingQueue = ch.getBlockingQueue();
        
        while(true) {
            String item;
            try {
                item = blockingQueue.take();
                UploadWorker uw = new UploadWorker();
                uw.setItem(item);
                uw.call();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }

}
