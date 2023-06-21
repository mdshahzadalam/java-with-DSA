package Array2D;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int i,j,m,n;

        

        System.out.println("Enter the row number ");
        m=sc.nextInt();
        System.out.println("Enter the column number ");
        n=sc.nextInt();
        System.out.println("Enter the matrix ");

        int arr[][] = new int[m][n];

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
System.out.println("---------------------------------------------------------------");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j<m-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    
}
