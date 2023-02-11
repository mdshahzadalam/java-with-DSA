// triangle pattern


public class pattern_triangle {
    public static void main(String [] args)
    {
        int i,j,n=10;
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==n && j<=n ||  j==1 && i<=n || i>=j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
