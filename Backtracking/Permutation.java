package Backtracking;
import java.util.*;
import java.io.*;

public class Permutation {

    public static String swap( String str, int i, int j)
    {
        char [] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;

        return String.valueOf(charArray);
    }

    public static void permute(String str, int l , int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                str=swap(str, l , i);
                permute(str, l+1, r);
                //backtracking
                str=swap(str,l,r);
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="XY";
        int n=str.length();
        System.out.println("for the string "+str+" permutations are ");
        permute(str,0,n-1);

    }
}
