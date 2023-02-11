public class logic_pattern {
    public static void main(String []args)
    {
        int i,j,n=10;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=n && j==1 || i==1 && j<=n || i==n/2 && j<=n || i<=n/2 && j==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // System.out.print("  ");  

           
         for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=n && j==1 || i<=n && j==n  || j<=n/2 && i+j==n || j>=n/2 && i-j==0)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.print("   ");  

           System.out.println();
         for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 && j<=n || i<=n/2 && j==1 || i==n/2 && j<=n || i>=n/2 && j==n || i==n && j<=n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.print("   ");  

        System.out.println();
      for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             if(i<=n && j==1  || i+j==7 || i-j==3)
             {
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }

     System.out.print("   ");  

        System.out.println();
      for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             if(i<=n && j==n/2)
             {
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }

     System.out.print("   ");  

        System.out.println();
      for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             if(i<=n && j==1 || i==n && j<=n)
             {
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }

     System.out.print("   ");  

     System.out.println();
   for(i=1;i<=n;i++)
  {
      for(j=1;j<=n;j++)
      {
          if(i<=n && j==1 || i==n && j<=n)
          {
              System.out.print("*");
          }
          else{
              System.out.print(" ");
          }
      }
      System.out.println();
  }

  System.out.print("   ");  

  System.out.println();
for(i=1;i<=n;i++)
{
   for(j=1;j<=n;j++)
   {
       if(i==1 && j<=n || i<=n/2 && j==1 || i==n/2 && j<=n || i>=n/2 && j==n || i==n && j<=n)
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
