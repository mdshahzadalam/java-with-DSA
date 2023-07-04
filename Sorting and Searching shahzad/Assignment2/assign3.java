package SearchSort.Assignment2;
import java.util.*;
import java.io.*;

public class assign3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        if((n & 1) == 1)
        System.out.println("Given number is odd");

        else
        System.out.println("Given number is even");
    }
}
