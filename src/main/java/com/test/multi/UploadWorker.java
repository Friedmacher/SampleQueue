/**
 * Project:		MoRIS
 * Created on: 	2022-02-01
 *
 * @author FRIEDMACHER, Manuel
 */
package com.test.multi;

import javafx.concurrent.Task;

public class UploadWorker extends Task<Void> {

    private String item;

    @Override
    protected Void call() throws Exception {
        System.out.println("From queue -> " + item);
        return null;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }



}
