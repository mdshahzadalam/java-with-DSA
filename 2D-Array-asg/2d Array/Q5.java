package Array2D;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j,m,n;
        System.out.println("Enter the row number ");
        m=sc.nextInt();
        System.out.println("Enter the co,umn number ");
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
            System.out.print(arr[i][m/2]+" ");
        }
            for(j=0;j<n;j++)
        
            {
                
                if(j==m/2)
                {
                    continue;
                }
                System.out.print(arr[m/2][j]+" ");
            }
        
    }
    
}
