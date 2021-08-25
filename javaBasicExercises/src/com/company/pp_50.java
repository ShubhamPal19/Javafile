package com.company;

public class pp_50 {

    public static void main(String[] args) {
        System.out.println("Divisible by 3:");
        for (int i = 3; i < 100; i += 3) {
            
            System.out.print(i + ",");
        }

        System.out.println("\nDivisible by 5:");
        for (int i = 5; i < 100; i += 5) {
            
            System.out.print(i + ",");
        }
        System.out.println("\nDivisible by both:");
        for (int i = 15; i < 100; i += 15) {

            System.out.print(i + ",");
        }
    }

}
