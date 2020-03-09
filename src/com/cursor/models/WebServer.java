package com.cursor.models;

public class WebServer implements Runnable {
    private Request request;

    public WebServer(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("This thread has request " + request);
    }
}
