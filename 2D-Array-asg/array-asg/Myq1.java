//wap to print the sum of all elements 
// arr[]={3,20,4,6,9};

package PWJAVA;

public class Myq1 {
    public static void main(String[] args) {
        
        int i=0,sum=0;

        int arr[]={3,20,4,6,9};

        while(i<arr.length)
        {
            sum+=arr[i];
            i+=2;
        }
        
        System.out.println(sum);
    }
    
}
