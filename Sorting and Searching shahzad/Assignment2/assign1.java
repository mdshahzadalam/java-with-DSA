package SearchSort.Assignment2;
import java.util.*;
import java.io.*;
public class assign1 {
    public static void dectToBinary(int n)
    {
        int []binayNum=new int[100];
        int i=0;
        while(n>0)
        {
            binayNum[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binayNum[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number ");
        int n=sc.nextInt();
        System.out.println("Binary number is ");
        dectToBinary(n);
        
    }
}
