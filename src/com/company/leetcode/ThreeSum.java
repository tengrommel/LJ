package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
15. 3Sum
	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
    Find all unique triplets in the array which gives the sum of zero.
 */

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			if (i>0 && nums[i] == nums[i-1]) continue;
			int low = i + 1, high = nums.length -1, sum = 0-nums[i];
			while (low < high) {
				if (nums[low] + nums[high] == sum) {
					res.add(Arrays.asList(nums[i], nums[low], nums[high]));
					while (low < high && nums[low] == nums[low+1]) low++;
					while (low < high && nums[high]==nums[high-1]) high--;
					low++;
					high--;
				}else if (nums[low] + nums[high] < sum) {
					low++;
				}else high--;
			}
		}
		return res;
	}
}
