// wap to find peak element

//arr[]={1,3,2,6,5};

package PWJAVA;

public class MyQ5 {
    public static void main(String[] args) {
        

        int arr[]={1,3,2,6,5};
        int max = Integer.MIN_VALUE;
        for(int val : arr)
        {
            max=Math.max(max,val);
        }
        System.out.println(max);

    }
    
}
