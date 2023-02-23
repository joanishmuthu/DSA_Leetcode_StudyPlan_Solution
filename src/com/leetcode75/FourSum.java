package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k = 0; k < nums.length; k++) {
					for (int l = 0; l < nums.length; l++) {
						if (i != j && i!=j && i!=k && i!=l && j!=i && j!=k && j!=l && l!=i && l!=j && l!=k && k!=i && k!=j && k!=l) {
							if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
								List<Integer> a = new ArrayList<>();
								a.add(nums[i]);
								a.add(nums[j]);
								a.add(nums[k]);
								a.add(nums[l]);
								Collections.sort(a);
								if (!res.contains(a)) {
									res.add(a);
								}
							}
						}
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		System.out.println(fourSum(nums, 0));
	}
}
