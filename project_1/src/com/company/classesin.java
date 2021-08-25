package com.company;

// public class Employee// a java code can have only one public class;

class Employee {

    int id;
    String name;
    

    public Employee()
    {
        System.out.println("New E-class created : ");
    }

    public void printdetails()

    {

        System.out.println("My id is " + id);
        System.out.println("My name is " + name);

    }
}

public class classesin {

    public static void main(String[] args) {
        
        System.out.println("THis is main class");



        Employee Rahul  =new Employee();

        Rahul.id=121;
        Rahul.name="Rahul Sharma";


        Rahul.printdetails(); 




    }

}
