package com.icbc.test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("please enter number 1 continue");
        while (true) {
            Scanner reader = new Scanner(System.in);
            int number = reader.nextInt();
            if (number == 1) {
                Person person = new Person();
                person.test();
            }

        }
    }
}
