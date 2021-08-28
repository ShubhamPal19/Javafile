package com.company;

import java.util.Scanner;

public class _1_ReverseArray {

    public static void main(String[] args) {


        int[] arr;

        arr=new int[1000];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= sc.nextInt();
        System.out.println("Enter data");
        for (int i = 0; i < n; i++) {

           arr[i]= sc.nextInt();
        }


        for (int i = 0; i < n; i++) {

         System.out.println(arr[i]);

        }



    }
}
