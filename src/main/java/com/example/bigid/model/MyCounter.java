package com.example.bigid.model;

public class MyCounter {

    private int count;

    public void increment() {
        int temp = count;
        count = temp + 1;
    }

    public int getCount() {
        return count;
    }
}

