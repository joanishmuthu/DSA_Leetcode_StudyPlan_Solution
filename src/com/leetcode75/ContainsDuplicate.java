package com.leetcode75;

public class ContainsDuplicate {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int c=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if((nums[i]==nums[j]) && (Math.abs(i-j)<=k)) {
					c++;
				}
			}
		}
		if(c>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
}
