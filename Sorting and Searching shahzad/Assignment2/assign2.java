package SearchSort.Assignment2;
import java.util.*;
import java.io.*;
public class assign2 {
    public static boolean isPowerOfTwo(int n)
    {
        if(n == 0)
        {
            return false;
        }
        while(n != 1)
        {
            if(n%2 != 0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Given number is "+isPowerOfTwo(n));
    }
}
