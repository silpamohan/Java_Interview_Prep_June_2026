package com.coding.Java_Interview_Prep_June_2026.Arrays;

//import java.util.Arrays;

//initializing and printing array using java 8
public class arrays {

    public static void main(String[] args)
    {
        int[] arr= { 1,2,3,4,5,6};

        //java 8 
       // Arrays.stream(arr).forEach(ar ->System.out.println(ar));

        //java 7
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    
}
