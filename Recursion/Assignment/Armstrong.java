package Recursion.Assignment;
import java.util.*;
import java.io.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int temp=n;

        int arm=0;
        while(n != 0)
        {
            int rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;

        }
        if(temp == arm)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        
    }
}
