package Array2D;
import java.util.*;
import java.io.*;
//java.lang.ArrayIndexOutOfBoundsException;
public class Q1 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row number ");
        int m=sc.nextInt();
        System.out.println("Enter the column Number ");
        int n=sc.nextInt();

        int arr[][] = new int[m][n];
        int i,j;
        System.out.println("Enter the matrix ");
        for( i=0;i<m;i++)
        {
            for( j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }

        int positive=0,negative=0,zero=0,odd=0,even=0;


        for( i=0;i<m;i++)
        {
            for( j=0;j<n;j++)
            {
                if(arr[i][j]>0)
                    positive++;
                if(arr[m][n]<0)
                    negative++;
                if(arr[m][n]==0)
                    zero++;
                if(arr[m][n]%2 !=0)
                    odd++;
                if(arr[m][n]%2 ==0)
                    even++;
            }
        }

        System.out.println("Positive Number are  "+positive);
         System.out.println("Negative Number are  "+negative);
          System.out.println("zero Number are  "+zero);
           System.out.println("odd Number are  "+odd);
            System.out.println("Even Number are  "+even);
    }
    
}
