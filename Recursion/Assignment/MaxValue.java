package Recursion.Assignment;
import java.util.*;
import java.io.*;

public class MaxValue {
    public static int maxValue(int []arr, int n, int idx)
    {
        if(idx == n-1)
        {
            return arr[n-1];
        }
        int maxOfLaterIndices=maxValue(arr, n, idx+1);
        int maxval=Math.max(arr[idx],maxOfLaterIndices);
        return maxval;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int [ ]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=maxValue(arr,n,0);
        System.out.println("Max value is "+result);
    }
}
