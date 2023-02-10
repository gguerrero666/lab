package com.gguerrero.lab.threads;

public class MainThread {
    public static void main(String args[]) {
        MainThreadClass threadClass = new MainThreadClass("Hilo 1");
        MainThreadClass threadClass1 = new MainThreadClass("Hilo 2");
        threadClass.start();
        threadClass1.start();

        MainThreadInterface threadInterface = new MainThreadInterface("Hilo 3");
        threadInterface.run();
    }
}
