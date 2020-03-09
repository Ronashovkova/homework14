package com.cursor.models;

public class Request {

    private String request;
    private String address;

    public Request(String request, String address) {
        this.request = request;
        this.address = address;
    }

    @Override
    public String toString() {
        return request + " from " + address;
    }
}
