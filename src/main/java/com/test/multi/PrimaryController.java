package com.test.multi;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    void onAction(ActionEvent event) {
        
        ContentHandler ch = ContentHandler.getInstance();
        
        ContentService cs = new ContentService();
        cs.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                System.out.println("done:" + t.getSource().getValue());
            }
        });
        cs.start();
        
        UploadService us = new UploadService();
        us.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                System.out.println("done:" + t.getSource().getValue());
            }
        });
        us.start();
        

    }
    
}
