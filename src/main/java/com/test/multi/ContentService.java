/**
 * Project:		MoRIS
 * Created on: 	2022-02-01
 *
 * @author FRIEDMACHER, Manuel
 */
package com.test.multi;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class ContentService extends Service<Void> {

    @Override
    protected Task<Void> createTask() {
        ContentQueue queue = new ContentQueue();
        try {
            queue.call();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
