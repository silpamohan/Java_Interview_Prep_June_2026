package com.coding.Java_Interview_Prep_June_2026.code.ArrayList;

//Maximum sum of subarray of size K

public class subarray {
public static void main(String[] args)
{
   int msum = 0;
   int k = 3;
   int csum = 0;
   int[] arr = {1,2,3,-1,0,4};
   for(int i=0;i<=(arr.length)-k;i++)
   {
    csum = 0;
     for(int j = i; j < i + k; j++)
     {
        csum += arr[j];
     }
     msum = Math.max(csum, msum);
     
   }
    System.out.println(msum);
} 
//smallest Sub array with sum  >= target


public void smallestSubAarray( int arr,int target)
{
    
   
}


}

    
    