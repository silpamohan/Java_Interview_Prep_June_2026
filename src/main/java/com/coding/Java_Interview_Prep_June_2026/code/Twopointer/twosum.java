package com.coding.Java_Interview_Prep_June_2026.code.Twopointer;

// Find the pair that add up to target
public class twosum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7 };
		int target = 7;
		twoSum(arr, target);
	}

	public static void twoSum(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];

			if (target == sum) {
				System.out.println(arr[left] + " " + arr[right]);
				return;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		System.out.println("no pair");
	}
}
