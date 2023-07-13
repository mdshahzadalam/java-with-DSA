package Backtracking.Assignments;
import java.util.*;
import java.io.*;

public class Ass_code2 {
    public static void  swap(int []nums, int x, int y)
    {
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;

        
    }
    public static void permute(int []nums)
    {
          List<List<Integer>> result=new ArrayList<>();
          if(nums == null || nums.length == 0)
          {
            return;
          }
          permutationHelper(result, nums,0);
          for(List<Integer> list: result)
          {
            for(Integer item : list)
            {
                System.out.print(item+" ");
            }
            System.out.println("");
          }
    }
    private static void permutationHelper(List<List<Integer>> result, int []nums , int start)
    {
        if(start == nums.length - 1)
        {
        List<Integer> list = new ArrayList<>();
        for(int n : nums)
        {
            list.add(n);
        }
        result.add(list);
        return;
        }
        for(int i=start ; i<nums.length;i++)
        {
            swap(nums,start,i);
            permutationHelper(result, nums, start+1);
            swap(nums, start,i);
        }
    }


    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println("the possible permutations are : ");
        permute(arr);
    }
}
