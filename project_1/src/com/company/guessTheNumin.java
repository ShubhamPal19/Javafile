package com.company;

import java.util.Random;
import java.util.Scanner;

class game
{

    private int number;
    private int attempts;


    boolean iscorrect(int guessedNum) {
        if(guessedNum==number)
        return true;
        String s = "The guessed number is ";
        int difference=guessedNum-number;
        if(difference<0)
        {
            if(difference<-30)
            {
                s=s+"too small.";
            }
            else
            s=s+"small.";

        }
        else
        { if(difference>30)
            {
                s=s+"too large.";
            }
            else
            s=s+"large.";

        }
        
        System.out.println(s);
        attempts++;
        return false;
    }

    public game() {

        Random d = new Random();
        number = d.nextInt(100);
        attempts = 1;

        playgame();

    }

    void playgame() {

        Scanner scan=new Scanner(System.in);

        int guessed_number;
        System.out.println("\nWelcome to My Guessing Game");
        while(true)
        {
            System.out.print("\nAttempt - "+ attempts+" !!! \nGuess the Number: ");
            guessed_number= scan.nextInt();
            if (iscorrect(guessed_number)) {
                System.out.println("You guessed the number correctly in "+attempts + " attempts.");
                break;
            }

            if(attempts==10)
            {
                System.out.println("Your attempt limit is reached. \nBetter luck next time, Thanks for playing this impressive game.");
            }
            
        }
        System.out.println("Thanks for Playing !!! ");

        scan.close();
    }

}

public class guessTheNumin {

    public static void main(String[] args) {

        game g = new game();  
    }

}
