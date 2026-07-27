package com.coding.Java_Interview_Prep_June_2026.code.Twopointer;

import java.util.Arrays;
import java.util.HashMap;

public class twosumsorted {
    

    public static int[] twoSum(int[] arr, int target)
    {
        
        HashMap<Integer, Integer> store = new HashMap<Integer,Integer>();

        
        for(int i=0;i<arr.length;i++)
        {
            int sum = target - arr[i];
            
           
            if(store.containsKey(sum) )
            {
                return new  int[] {store.get(sum),i};
            }
              store.put(arr[i],i);
           
        }
        
        return new int[]{};
    }


    public static void main(String[] args)
    {
      int[] arr = {2,1,4,3};
      int[] out = twoSum(arr,6);
      Arrays.stream(out).forEach(e->System.out.println(e));
    }
    
    
}
