/*
 Reverse the array in place by swapping elements from the ends toward the center.
 Use two pointers, i and j, and swap arr[i] with arr[j] until they cross.
 */

package com.coding.Java_Interview_Prep_June_2026.Arrays;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		int[] arr = {3, 4, 3, 2, 1};
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}

		Arrays.stream(arr).forEach(a -> System.out.println(a));
	}
}