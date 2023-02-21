package com.leetcode75;

public class SearchInsertPosition {
	static int finalval;
	public static int searchInsert(int[] nums, int target) {
		System.out.println(nums.length-1);
		search(nums,0,target,0);
		return finalval;
	}
	private static void search(int[] nums, int i, int target,int count) {
		// TODO Auto-generated method stub
		if(i==nums.length) {
			return;
		}
		else {
			if(nums[i]==target && count==0) {
				count++;
				finalval=i;
			}
			else if(target<nums[i] && count==0) {
				count++;
				finalval=i;
			}
			else if(target>nums[i] && count==0 && i==nums.length-1) {
				count++;
				finalval=i+1;
			}
			search(nums, ++i, target,count);
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,3};
		System.out.println(searchInsert(nums, 2));
	}
}
