

//      Pattern for A


class Pattern
{
   public static void main(String args[])
   {
       int i,j;
       int n=10;
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || j==n && i<=n || i==1 && j<=n || i==5 && j<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || j==n && i<=n || i==1 && j<=n || i==5 && j<=n || i==n && j<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || i==1 && j<=n || i==n && j<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || i==1 && j<=n || i==n && j<=n || j==n && i<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || i==1 && j<=n || i==n && j<=n || i==n/2 && j<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || i==1 && j<=n || i==n/2 && j<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || i==1 && j<=n || i==n && j<=n || i>=n/2 && j==n || i==n/2 && j>=n/2)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n;j++)
        {
            if(i<=n && j==1 || i<=n && j==n || i==n/2 && j<=n)
            {
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("  ");
       System.out.println();
   }
}