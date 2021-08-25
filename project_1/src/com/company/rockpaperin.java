package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class rockpaperin {
    


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int p1score,p2score;
        p1score=p2score=0;
        Random d=new Random();

        int n=d.nextInt();
        System.out.println(n);
        int players_choice;

        System.out.println("Enter the choice based on given choice table : \n \t\t Choice\t\t Value\n \t\t Stone\t\t 1\n \t\t Paper\t\t 2\n \t\t Scissors\t 3");
        for (int i = 1; i < 6; i++) {
            
            System.out.println("\n\nRound "+i+" !!!");
            System.out.println("\nEnter Your Choice : ");
            players_choice=sc.nextInt();
            n=Math.abs(d.nextInt())%3;
            n=n%3+1;

            if (n==players_choice) {
                System.out.println("TIE!!! Replay this round \n ");
                i--;
              
            }

            else 
            {
                switch (players_choice) {
                    case 1 ->{
                        switch (n) {
                            case 2 -> { 
                                System.out.println("Computer wins this round !");
                                p2score++;
                            
                            }
                            case 3 ->{
                                System.out.println("You win this round! ");
                                p1score++;
                                
                            } 
                                
                               
                        }
                    }
                    case 2 ->{
                        switch (n) {
                            case 1 -> { 
                                System.out.println("You wins this round !");
                                p1score++;
                            
                            }
                            case 3 ->{
                                System.out.println("Computer win this round! ");
                                p2score++;
                                
                            } 
                                
                               
                        }
                    }
                    case 3 ->{
                        switch (n) {
                            case 1 -> { 
                                System.out.println("Computer wins this round !");
                                p2score++;
                            
                            }
                            case 2 ->{
                                System.out.println("You win this round! ");
                                p1score++;
                                
                            } 
                                
                               
                        }
                    }




                        
                       
                }

                


            }
            
        }


        if (p1score>p2score) {
            System.out.println("\nYou won this game :");
            
        }
        else
        {
            System.out.println("\nComputer won this game :");

        }
        


        sc.close();
    }
}
