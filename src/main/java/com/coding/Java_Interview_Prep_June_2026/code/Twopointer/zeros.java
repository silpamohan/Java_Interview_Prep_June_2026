package com.coding.Java_Interview_Prep_June_2026.code.Twopointer;

import java.util.Arrays;

public class zeros {

    static void pushZerostoEnd(int[] arr)
    
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with
                // the 0 at index 'count'
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move 'count' pointer to 
                // the next position
                count++;
            }
        }

    }

    public static void main(String[] args)
    {
        int[] arr = {0,2,0,4,5,6};
      pushZerostoEnd(arr);
      Arrays.stream(arr).forEach(e->{System.out.println(e);});

    }

}
