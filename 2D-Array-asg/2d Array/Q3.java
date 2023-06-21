package Array2D;
import java.util.*;
public class Q3 {
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
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || i+j==2)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    
}
