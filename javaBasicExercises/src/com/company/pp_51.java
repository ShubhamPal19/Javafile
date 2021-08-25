package com.company;

import java.util.Scanner;


public class pp_51 {


    public static void main(String[] args) {
        
        
        // string to int
        int place=1, intgr=0;
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        
        
        for(int i=s.length()-1;i>=0;i--)
        {
            intgr+= (int)(s.charAt(i)-'0')*place;
            place*=10;

        }

        System.out.println(intgr);
        sc.close();


        
    }


    
}
