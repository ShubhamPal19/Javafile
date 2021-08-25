package com.company;

public class varargsin {
    

    static int sum( int ...arr)   //can accept no arguments
    {

        int result=0;


        for(int element : arr)
        {
            result+=element;
        }

        return result;


        


    }
    // static int sum(int a, int ...arr)   //accept atleast 1 agrument
    // {

    //     int result=a;


    //     for(int element : arr)
    //     {
    //         result+=element;
    //     }

    //     return result;


        


    // }

    public static void main(String[] args) {



        System.out.println( "The sum of num is : " + sum(28, 23,432,34,234,234,234,2,342,34,234,2,34,234,23,42,34,32));

        
    }
}
