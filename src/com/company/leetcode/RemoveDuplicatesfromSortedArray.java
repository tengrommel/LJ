package com.company.leetcode;

public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] nums){
		if (nums == null || nums.length == 0) return 0;
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i-1] != nums[i]){
				nums[count++] = nums[i];
			}
		}
		return count;
	}
}
