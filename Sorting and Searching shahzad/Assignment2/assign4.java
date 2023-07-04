package SearchSort.Assignment2;
import java.util.*;
import java.io.*;
public class assign4 {
    public static int countSetBit(int n)
    {
        int count=0;
        while(n>0)
        {
            count +=n & 1;
            n >>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int result=countSetBit(n);
        System.out.println("the number of set bits in the given number "+result);
    }
}
