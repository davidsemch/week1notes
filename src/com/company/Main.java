package com.company;

import java.until.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String name = input.nextLine();

        System.out.println("hello world!");
        int age = 17;
        double gpa = 3.5;
        boolean isRaining = false;
        System.out.println(age + "|" + gpa + "|" + isRaining );


        String city = "Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());
        float pi = 3.141596535f;


            int sum = 3+2;
            System.out.println(sum);

            double quotient = 10.0/4;
            System.out.println(quotient);

            int i = 1;
            i++;
    }
}
