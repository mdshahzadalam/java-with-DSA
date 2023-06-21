// wap traverse over the elements of the array using for each loop and print all even elements;
// arr[]={34,21,54,65,43};

package PWJAVA;

public class MyQ2 {

    public static void main(String[] args) {
        
        int arr[]={34,21,54,65,43};
        int i=0;

        while(i<arr.length)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
            i++;
        }

    }
    
}
