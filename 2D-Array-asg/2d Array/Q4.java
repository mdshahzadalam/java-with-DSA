package Array2D;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j,m,n;
        System.out.println("Enter the row number ");
        m=sc.nextInt();
        System.out.println("Enter the column number ");
        n=sc.nextInt();

        int arr[][]=new int[m][n];

        System.out.println("Enter the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }


      int max=Integer.MIN_VALUE;

        for(i=0;i<m;i++)
        {
           
        //int max =arr[i][0];
        for(j=0;j<n;j++)
        {
           
            if(max<arr[i][j])
            {
                max=arr[i][j];
            }
        }
        //System.out.println("Max number is - "+max);
        
        
    }
    System.out.println(max);
     
    
    }
}
