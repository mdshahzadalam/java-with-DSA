package Recursion.Assignment;
import java.util.*;
import java.io.*;
// +1 -2 +3......
public class SingSum {
    public static int signSum(int n, int i)
    {
        if(i == n+1)
        {
            return 0;
        }
        if(i%2== 0)
        {
            return (signSum(n, i+1)-i);
        }
        else{
            return (signSum(n, i+1)+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int result=signSum(n,1);
        System.out.println("sum is "+result);
    }
}
