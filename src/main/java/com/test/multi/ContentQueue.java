package com.test.multi;

import java.util.concurrent.BlockingQueue;

import javafx.concurrent.Task;

public class ContentQueue extends Task<Void> {

    @Override
    protected Void call() throws Exception {
        String item = null;
        boolean response = false;
        int counter = 0;
        
        ContentHandler ch = ContentHandler.getInstance();
        BlockingQueue<String> blockingQueue = ch.getBlockingQueue();
        
        for (int i = 0; i < 20; i++) {
            do {
                item = "Item " + i;
                response = blockingQueue.offer(item);
                counter++;
                System.out.println("Try: " + counter);

            } while (response);
            counter = 0;
            System.out.println(item);
            System.out.println(blockingQueue.size());
        }
        
        System.out.println("Finished adding to queue");
        
        return null;
    }

}
