




import java.util.Scanner;






class max_min{
    int max,min;


}

class find{


    max_min findmaxmin(int[] a, int l , int r){

        max_min mm=new max_min();
        if (r==l)
        {
            mm.max=mm.min=a[l];
            return mm;
        }
        int mid=(r+l)/2;
        max_min lmm=findmaxmin(a,l,mid);
        max_min rmm=findmaxmin(a,mid+1,r);

        mm.max= Math.max(lmm.max,rmm.max);
        mm.min=Math.min(lmm.min, rmm.min);


        return mm;




    }


}

public class kthMaxMin{







    public static void main(String[] args)
    {

        int[] arr;

        arr=new int[1000];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= sc.nextInt();
        System.out.println("Enter data");
        for (int i = 0; i < n; i++) {

            arr[i]= sc.nextInt();

        }

        find f=new find();
        max_min mm  = f.findmaxmin(arr,0,n-1);
        System.out.println("The max element is "+mm.max +" and min element is "+ mm.min);



        sc.close();


    }





}
