public class special_patter {
    public static void main(String [] args)
    {
        int i,j,n=14;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=n && j==1 || i==1 & j<=n || j==n && i<=n || i==n && j<=n || 
                i==0 && j<=n/2 || j==0 && i<=n/2 || i+j<=n/2  || i==0 && j>=n/2 || j==n && i<=n/2 || j-i>=n/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
