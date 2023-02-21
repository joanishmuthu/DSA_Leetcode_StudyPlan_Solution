package com.leetcode75;

public class TwoSum {
	static public int[] twoSum(int[] nums, int target) {
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					int sum=nums[i]+nums[j];
					if(sum==target) {
						result[0]=i;
						result[1]=j;
						break;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] res=twoSum(nums, target);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
		
	}
}
