package SearchSort.Assignment1;
import java.util.*;
import java.io.*;

public class assign2 {
    public static void selectionSortInDecrese(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n - 1;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] > arr[min_idx])
                {
                    min_idx=j;
                    
                }

            }
            if(min_idx != i)
            {
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        selectionSortInDecrese(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
