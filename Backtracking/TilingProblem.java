package Backtracking;
import java.util.*;
import java.io.*;

public class TilingProblem {
    public static int getWays(int n)
    {
        if(n <= 3)
        {
            return n;
        }
        else
        {
            return getWays(n-1) + getWays(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tiles number ");
        int n=sc.nextInt();
        int result=getWays(n);
        System.out.println("Ways of tiles fitting "+result);

    }
}
