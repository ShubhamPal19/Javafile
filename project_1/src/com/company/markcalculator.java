package com.company;



import java.util.Scanner;

public class markcalculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the maximum marks : ");
        int mm = sc.nextInt();
        System.out.print("Enter the number of subject : ");
        int n= sc.nextInt();

        int sum=0;
        for (int i = 0; i < n ; i++) {
            sum = sum+ sc.nextInt();

        }

        float percentage=  sum*100/(n*mm);
        System.out.print("Student got ");
        System.out.print(percentage);
        System.out.println("% marks.");
        

        sc.close();
    }

}
