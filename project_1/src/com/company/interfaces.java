package com.company;

interface human {

    
    int id=23;
  

    public void height();

    public void weight();

}

class boy implements human {




    public void height() {
        System.out.println("h");  

    }

    public void weight() {
        System.out.println("w");

    }

    void helo() {
        System.out.println("hello");
        this.height();
        this.weight();
    }
}

public class interfaces {

    public static void main(String[] args) {



        boy raghu =new boy();

        raghu.helo();
        
        System.out.println(raghu.id);
       
    }
}
