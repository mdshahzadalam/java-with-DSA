package SearchSort.Assignments;
import java.util.*;
import java.io.*;
public class assign1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target Element - ");
        int x=sc.nextInt();

        int idx=-1;

        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)

            {
                idx=i;
                break;

            }
        }
        if(idx == -1)
        {
            System.out.println("Element is not found in an array");
        }
        else
        {
            System.out.println("Element found in the array in location of - "+idx);
        }
    
    }
}
