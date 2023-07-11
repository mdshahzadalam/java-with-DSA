package Recursion.Assignment;
import java.util.*;
import java.io.*;

public class DigitsSum {
    public static int sumOfDigits(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else{
            return (n%10 + sumOfDigits(n/10));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int result=sumOfDigits(n);
        System.out.println("Sum of the digits "+result);
    }
}
