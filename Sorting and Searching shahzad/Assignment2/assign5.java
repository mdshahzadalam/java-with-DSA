package SearchSort.Assignment2;
import java.util.*;
import java.io.*;
public class assign5 {
    public static int  findOddOccuring(int []arr)
    {
        int xor=0;
        for(int i : arr)
        {
            xor =xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.println("The odd occuring number "+findOddOccuring(arr));

    }
}
