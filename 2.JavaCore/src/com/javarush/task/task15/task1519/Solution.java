package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String text = r.readLine();
            try {
                if (text.equals("exit")) {
                    break;
                } else if (text.contains(".")) {

                    Double a = Double.parseDouble(text);
                    print(a);

                } else if (Integer.parseInt(text) > 0 && Integer.parseInt(text) < 128) {
                    short a = Short.parseShort(text);
                    print(a);

                } else if (Integer.parseInt(text) <= 0 || Integer.parseInt(text) >= 128) {
                    print(Integer.parseInt(text));

                }

            } catch (NumberFormatException e) {
                print(text);
            }


        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
