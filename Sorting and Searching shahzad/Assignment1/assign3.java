package SearchSort.Assignment1;
import java.util.*;
import java.io.*;
public class assign3 {
    public static void insertionSortInDecrease(int []arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j] > arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
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
        insertionSortInDecrease(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
