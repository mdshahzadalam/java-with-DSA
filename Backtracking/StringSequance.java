package Backtracking;
import java.util.*;
import java.io.*;

public class StringSequance {
    public static void printSequance(int []arr,int index, ArrayList<Integer> tempArr)
    {
        //base case
        if(index == arr.length)
        {
            if(tempArr.size() > 0)
            {
                System.out.println(tempArr);
               
            }
             return;
        }
        // include
        printSequance(arr,index+1, tempArr);
        //add the value in tempArr
        tempArr.add(arr[index]);
        //do not include
        printSequance(arr,index+1,tempArr);
        //remove the last value
        tempArr.remove(tempArr.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2};

        System.out.println("for the array "+Arrays.toString(arr));
        printSequance(arr,0, new ArrayList<>());

    }
}
