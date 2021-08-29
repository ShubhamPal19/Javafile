

import java.util.Scanner;

public class _1_ReverseArray {

    public static void main(String[] args) {


        int[] arr;

        arr=new int[1000];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= sc.nextInt();
        System.out.println("Enter data");
        for (int i = 0; i < n; i++) {

           arr[i]= sc.nextInt();
        }
        int i=0 , j=n-1;

        while(i<j)
        {
           int t=arr[i];
           arr[i]=arr[j];
           arr[j]=t;


        }


        for ( i = 0; i < n; i++) {

         System.out.println(arr[i]);

        }



    }
}
