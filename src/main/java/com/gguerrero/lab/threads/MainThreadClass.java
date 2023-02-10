package com.gguerrero.lab.threads;

public class MainThreadClass extends Thread{
    private String threadName;
    public MainThreadClass(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for (int i = 0; i<=50; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}
