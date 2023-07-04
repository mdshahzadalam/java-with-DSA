package SearchSort.Assignment1;
import java.util.*;
import java.io.*;
public class assign4 {
     public static int sortInDecrease(int []arr)
    {
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n-i-1;j++)
            {
                // bubble sort
                if(arr[j] < arr[j+1])
                {
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;

                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       

        System.out.println("Pass value - "+sortInDecrease(arr));
    }
}
