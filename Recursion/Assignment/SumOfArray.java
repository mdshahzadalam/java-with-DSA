package Recursion.Assignment;
import java.util.*;

import collection.APIandAnnotaion.annotaion3;

import java.io.*;

public class SumOfArray {
    public static int sumOfArray(int []arr, int n)
    {
        if(n == 0)
        {
            return arr[n];
        }
        else{
            return (arr[n] + sumOfArray(arr, n - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size ");;
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=sumOfArray(arr,n-1);
        System.out.println("Sum is "+result);
    }
}
