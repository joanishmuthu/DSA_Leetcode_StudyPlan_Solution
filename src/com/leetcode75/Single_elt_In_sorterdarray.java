package com.leetcode75;

public class Single_elt_In_sorterdarray {
	static int finalval;
    public static int singleNonDuplicate(int[] nums) {
        count(nums,0);
        return finalval;
    }
    private static void count(int[] nums, int i) {
		// TODO Auto-generated method stub
		if(i==nums.length-1 || nums.length==1) {
			if(nums.length==1) {
				finalval=nums[i];
			}
			else if(nums[i]!=nums[i-1]) {
				finalval=nums[i];
			}
			return;
		}
		else {
			if(nums[i]==nums[i+1] && i+2<nums.length-1) {
				i=i+2;
			}
			else if(nums[i]==nums[i+1] && i+2>nums.length-1) {
				i=i+1;
			}
			else {
				finalval=nums[i];
				i=i+1;
			}
			count(nums, i);
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(nums));
	}
}
