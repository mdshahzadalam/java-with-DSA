// wap to find the second last largest elements in a given array.
// arr[]={34,21,54,65,43};

package PWJAVA;

public class MyQ4 {

    public static void main(String[] args) {

        int arr[]={34,21,54,65,43};

        int arr_size=arr.length;
        int i,first,second;
        
        if(arr_size <2)
        {
            System.out.println("Invalid Input.");
            return;
        }
        int largest=second=Integer.MIN_VALUE;
        for(i=0;i<arr_size;i++)
        {
            largest=Math.max(largest,arr[i]);
        }

        for(i=0;i<arr_size;i++)
        {
            if(arr[i] != largest)
            {
                second = Math.max(second,arr[i]);
            }
        }

        if(second == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest element.");
        }
        else{
            System.out.print("second largest "+second);
        }


    }
    
}
