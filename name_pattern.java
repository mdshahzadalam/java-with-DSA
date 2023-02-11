
    
class Name_pattern
{
    public static void main(String [] args)
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
        // System.out.print("  ");  

           //D
         for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=n && j==1 || i==1 && j<=n || i==n && j<=n || i<=n && j==n)
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
//S
           System.out.println();
         for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 && j<=n || i==n/2 && j==n || i==n && j<=n || i<=n/2 && j==1 || i<=n/2 && j==n)
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
//H
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

     System.out.print("   ");  

        System.out.println();
        //A
      for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             if(i<=n && j==1 || i==1 && j<=n || i<=n && j==n || i==n/2 && j<=n)
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
        //H
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

     System.out.print("   ");  

     System.out.println();
     //Z
   for(i=1;i<=n;i++)
  {
      for(j=1;j<=n;j++)
      {
          if(i==1 && j<=n || i==n && j<=n || i+j ==10)
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

  //A
for(i=1;i<=n;i++)
{
   for(j=1;j<=n;j++)
   {
       if(i<=n && j==1 || i==1 && j<=n || i<=n && j==n || i==n/2 && j<=n)
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

//D
for(i=1;i<=n;i++)
{
 for(j=1;j<=n;j++)
 {
     if(i<=n && j==1 || i==1 && j<=n || i==n && j<=n || i<=n && j==n)
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

//A
for(i=1;i<=n;i++)
{
 for(j=1;j<=n;j++)
 {
     if(i<=n && j==1 || i==1 && j<=n || i<=n && j==n || i==n/2 && j<=n)
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

//L
for(i=1;i<=n;i++)
{
 for(j=1;j<=n;j++)
 {
     if(i<=n && j==1  || i==n && j<=n)
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

//A
for(i=1;i<=n;i++)
{
 for(j=1;j<=n;j++)
 {
     if(i<=n && j==1 || i==1 && j<=n || i<=n && j==n || i==n/2 && j<=n)
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
