package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = "";
        while (!command.equals("Exit")) {
        try {
                command = br.readLine();
                String[] array = command.split(" ");
                switch (array[0]) {
                    case "-c":
                        SimpleDateFormat p = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);   //-c
                        if (array[2].equals("м")) {
                            try {
                                allPeople.add(Person.createMale(array[1], p.parse(array[3])));
                            } catch (ParseException e) {
                            }
                        }
                        else if (array[2].equals("ж")) {
                            try {
                                allPeople.add(Person.createMale(array[1], p.parse(array[3])));
                            } catch (ParseException e) {
                            }
                        }
                        System.out.println(allPeople.size()-1);
                        break;
                    case "-u":
                        System.out.println(command);
                        break;
                    case "-d":
                        System.out.println(command);
                        break;
                    case "-i":
                        int id = Integer.parseInt(array[1]);
                        SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                      //  System.out.println(id);
                        System.out.println(allPeople.get(id).getName() + " " + f.format(allPeople.get(id).getBirthDate()));
                        break;

                }
            } catch(IOException e){

            }

        }
        //start here - начни тут
    }
}
