package com.leetcode75;

public class MaxSubarray {
	public static void main(String[] args) {
		int[] nums= {-2,-1};
		int sum=0;
		int maxsum=nums[0];
		for(int i=0;i<nums.length;i++) {
			sum=nums[i];
			if(sum>maxsum) {
				maxsum=sum;
			}
			 for(int j=i+1;j<nums.length;j++) {
				 sum=sum+nums[j];
				 if(sum>maxsum) {
					 maxsum=sum;
				 }
			 }
			 if(nums.length==1) {
				 maxsum=nums[0];
			 }
		}
		System.out.println(maxsum);
	}
}
