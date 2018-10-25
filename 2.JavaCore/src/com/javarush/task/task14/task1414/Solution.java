package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("cartoon") || str.equals("thriller") || str.equals("soapOpera")) {
                System.out.println(MovieFactory.getMovie(str).getClass().getSimpleName());
            } else {
                MovieFactory.getMovie(str);
                break;
            }
        }
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    public static class Cartoon extends Movie {

    }

    public static class Thriller extends Movie {

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            else if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
}
