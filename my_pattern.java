public class my_pattern {
    public static void main(String []args)
    {
        int i,j,n=10;

        //M
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=n && j==1 || i<=n && j==n || i<=n/2 && i==j || i<=n/2 && i+j==n)
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
