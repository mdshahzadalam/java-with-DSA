package SearchSort.Assignment1;
import java.util.*;
import java.io.*;
public class assign5 {
     public static int selectionSortInDecrese(int []arr)
    {
        int n=arr.length;
        int count =0;

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
                count++;
            }
        }
        return count;
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

        
        System.out.println("Iteration value - "+selectionSortInDecrese(arr));
    }
}
