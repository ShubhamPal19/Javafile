package com.company;

import  java.util.Scanner;
public class literalsInJava {

    public static void main(String[] args) {
        byte age=23;
        System.out.println(age);
        // short ar=4234;
        // int b=323;
        // float c= 23.3f;
        // double aa=3.3d;



        // taking input

//        System.out.println("It works");
//
        Scanner sc= new Scanner(System.in);
//
//
//        System.out.println("Enter number 1");
//        int x= sc.nextInt();
//        System.out.println("Enter number 2");
//        int y = sc.nextInt();
//        int sum=x+y;
//        System.out.print("Sum of above two numbers is ");
//        System.out.println(sum);


//        boolean b1=sc.hasNextInt();  // check whether input is valid or not
//
//
//        System.out.println(b1);
        String s = sc.next();
        System.out.println(s);
        String complete_str = sc.nextLine();
        System.out.println(complete_str);

        sc.close();
    }
}
