package SearchSort.Assignments;
import java.util.*;
import java.io.*;
public class assign2 {
    public static int lastOccurance(int []arr, int target)
    {
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low <= high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid] == target)
            {
                result=mid;
                low=mid+1;
            }
            else if(arr[mid] < target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return result;
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
        System.out.println("Enter the target element ");
        int target=sc.nextInt();
        
        int result=lastOccurance(arr,target);

        if(result == -1)
        System.out.println("Given element is not found "+result);

        else
        System.out.println("Given element is found in the location of array "+result);
    }
}
