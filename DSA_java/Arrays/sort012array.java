import java.util.Scanner;


class collection{

    void swap(int[] arr,  int i, int j)
    {

        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
}




public class sort012array {
    




    

// function to sort a array having only  -0,1 and 2 elements;

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
        
        int i,j,k;
        i=0;
        j=0;
        k=n-1;
        
        collection c = new collection();
        while (j <=k)
        {
            switch (arr[j]) {
                case 0 -> c.swap(arr,i++,j++);
                case 1 -> j++;
                case 2 -> c.swap(arr,j,k--);
            }
        }
        System.out.println("THe sorted array is :");
        sc.close();
        
        for ( i = 0; i < n; i++) {
            
            System.out.print(arr[i]+"  ");
            
        }
        

     }
}
