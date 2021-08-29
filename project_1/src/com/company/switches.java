package com.company;

public class switches {


    public static void main(String[] args) {
        int value;
        value = 2;
        switch(value){


            case (2):
                    System.out.println("the value is 2");
                    break;

            case (3):
                    System.out.println("the value is 3");
                    break;

            case (4):
                    System.out.println("the value is 4");
                    break;

            case (5):
                    System.out.println("the value is 5");
                    break;

            default:
                    System.out.println("value is different");

        }
        
        
        
        
        //  enhanced switches  ->  NO NEED TO USE BREAK STATEMENTS.

        int val;
        val = 4;
        switch(val){


            case (2) -> {System.out.println("the value is 2");
                       System.out.println("helodfasdf");
                      }

            case (3) ->  System.out.println("the value is 3");

            case (4) ->  System.out.println("the value is 4");

            case (5) ->  System.out.println("the value is 5");

            default  -> System.out.println("value is different");

        }


    }
} 