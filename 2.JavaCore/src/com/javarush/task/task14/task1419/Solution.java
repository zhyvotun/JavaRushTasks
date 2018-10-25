package com.javarush.task.task14.task1419;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Integer result = null;
            int i = 1 / result;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[10];
            for (int i = 0; i <= arr.length; i++) {
                arr[i] = i;
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String fileName = "";
            FileInputStream fis = new FileInputStream(fileName);
        } catch (Exception ex) {
            exceptions.add(ex);
        }
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Integer a = Integer.parseInt("asdas");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File.createTempFile("", "");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchElementException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new SQLException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
