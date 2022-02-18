/**
 * Project:		MoRIS
 * Created on: 	2022-02-01
 *
 * @author FRIEDMACHER, Manuel
 */
package com.test.multi;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ContentHandler {

 	private static ContentHandler instance;
 	
 	private BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>(5);
    
 	
	private ContentHandler() {}
 
	public static synchronized ContentHandler getInstance() {
		if (instance == null) {
			instance = new ContentHandler();
		}
		return instance;
	}
	
    public BlockingQueue<String> getBlockingQueue() {
        return blockingQueue;
    }

    public void setBlockingQueue(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
	
	


	


}
