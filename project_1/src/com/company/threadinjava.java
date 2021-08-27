package com.company;





class Thread1 extends Thread{

    void run()
    {

        for (int i = 0; i < 50000; i++) {
                System.out.println("T1 is running!!!!!!!!!!!!!!!!!!!!!");
        }

    }
}
class Thread2 extends Thread{


    // void start()
    // {
    //     System.out.println("T2 is running------------------");
        
    // }
    void run()
    {

        for (int i = 0; i < 50000; i++) {
                System.out.println("T2 is running------------------");
        }

    }
}

public class threadinjava {

    public static void  main(String[] args){

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();


        t1.start();
        t2.start();


    }
}
