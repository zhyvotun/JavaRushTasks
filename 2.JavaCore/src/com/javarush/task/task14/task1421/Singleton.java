package com.javarush.task.task14.task1421;

public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        Singleton arra = new Singleton();
        return instance;
    }
}
