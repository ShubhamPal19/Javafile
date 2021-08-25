package com.company;



class a{

    public void hello()
    {
        System.out.println("hello world from A");
        
    }
}

class b extends a{


    @Override 
    public void hello() //overriden method of class a
    { 
        System.out.println("hello world from B");

    }

    public void gm()
    {
        System.out.println("good morning from gm ");

    }
}
public class methodoverriding {
    

    public static void main(String[] args) {
        
        a obj1= new a();
        b obj2= new b();

        obj1.hello();

        obj2.hello();

    }
}
