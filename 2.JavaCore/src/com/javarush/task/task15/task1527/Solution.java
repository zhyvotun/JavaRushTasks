package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] cutIndex = str.split("\\?");
        str = cutIndex[1];
        String[] params = str.split("&");

        for (String param : params) {
            Pattern pattern = Pattern.compile("(.*?)=");
            Matcher matcher = pattern.matcher(param);
            if (matcher.find()) {
                System.out.print(matcher.group(1)+" ");
            }else
            System.out.print(param + " ");
        }

        if(str.indexOf("obj")!=-1) {
            System.out.println();
            Pattern pattern = Pattern.compile("obj=(.*?)&");
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                String res = matcher.group(1);
                    try {
                        alert(Double.parseDouble(res));
                    }
                    catch (Exception e){
                        alert(res);
                    }
            }
        }

        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
