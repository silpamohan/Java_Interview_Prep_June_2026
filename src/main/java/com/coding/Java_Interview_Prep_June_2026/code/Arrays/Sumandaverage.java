package com.coding.Java_Interview_Prep_June_2026.code.Arrays;

// find sum and average of array

public class Sumandaverage
{
    public static void main(String[] args)
    {
        int sum = 0;
        int avg = 0;
        int[] arr = {1, 2, 3, 4, 3, -1};
        for (int e : arr)
        {
            sum += e;
        }
        avg = sum / arr.length;

        System.out.println("sum: " + sum + " average: " + avg);
    }
}
