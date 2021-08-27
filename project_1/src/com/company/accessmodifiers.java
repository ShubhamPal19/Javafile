package com.company;


class access{

    public String a="Public string";
    protected String b="protected string";
    String c=" defalt string";
    private String d="private string";


    void meth1()
    {


        // all type of variables are accessible within a class

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class accessmodifiers {



    public static void main(String[] args) {

        access obj = new access();
        
        obj.meth1();


        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        // System.out.println(obj.d);    not accessible outside a class

        
    }

}
