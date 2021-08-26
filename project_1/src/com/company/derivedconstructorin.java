package com.company;


class base_class{

    base_class(){


        System.out.println("THe base class contructor with 0 parameter is called.");

    }
    base_class(int n){


        System.out.println("THe base class contructor with 1 parameter is called.  value = "+n+" .");

    }

}




class inherited_class extends base_class{


    inherited_class(){

        System.out.println("The constructor of inherited class is  being called.");
    }

    inherited_class(int a){

        super(a);

        System.out.println("The constructor of inherited class is  being called.");
    }


    
}

public class derivedconstructorin {
    

    public static void main(String[] args) {
        



        inherited_class j=new inherited_class();
        inherited_class i=new inherited_class(12);
    }


}
