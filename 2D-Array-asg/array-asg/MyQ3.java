//wap to calculate the maximum elements in the array
//arr[]={34,21,54,65,43};

package PWJAVA;

public class MyQ3 {

    public static void main(String[] args) {
        
        int arr[]={34,21,54,65,43};
        int max = Integer.MIN_VALUE;
        for(int val : arr)
        {
            max=Math.max(max,val);
        }
        System.out.println("Max value is "+max);

    }
    
}
