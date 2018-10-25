package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();
        Thread thread = new Thread(specialThread);
        thread.run();
        Thread thread1 = new Thread(specialThread1);
        thread1.run();
        Thread thread2 = new Thread(specialThread2);
        thread2.run();
        Thread thread3 = new Thread(specialThread3);
        thread3.run();
        Thread thread4 = new Thread(specialThread4);
        thread4.run();
        list.add(thread);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
