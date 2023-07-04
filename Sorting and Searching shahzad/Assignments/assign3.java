package SearchSort.Assignments;
import java.util.*;
import java.io.*;

public class assign3 {
    public static int countNumber(int []arr, int target)
    {
        int low =0;
        int high=arr.length - 1;
        int count=0;
        int result;
         while(low <= high)
         {
            int mid=low+ (high-low)/2;
            if(arr[mid] == target)
            {
                result=mid;
                low=mid+1;
                count++;
            }
            else if(arr[mid] > target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

         }
         return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("which number you want to count ");
        int target=sc.nextInt();
        int result=countNumber(arr,target);
        if(result == 0)
        {
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element found in "+result+" time.");
        }
        
    }
}
