package com.coding.Java_Interview_Prep_June_2026.code.Arrays;

/** find min and max of the array */
class Maxmin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1};

        int max = arr[0];
        int min = arr[0];

        for (int e : arr) {
            if (e > max) {
                max = e;
            }
            if (e < min) {
                min = e;
            }
        }

        System.out.println("max = " + max + ", min = " + min);
    }
}

