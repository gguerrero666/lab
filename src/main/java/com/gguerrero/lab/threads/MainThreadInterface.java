package com.gguerrero.lab.threads;

public class MainThreadInterface implements Runnable{

    private String threadName;
    public MainThreadInterface(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for (int i = 0; i<=50; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}
