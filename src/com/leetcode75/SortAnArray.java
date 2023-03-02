package com.leetcode75;

public class SortAnArray {
	static int[] arr;
    public static int[] sortArray(int[] nums) {
    	arr=nums;
        for(int i=0;i<arr.length;i++) {
        	Recursivesort(arr,0);
        }
        return nums;
    }
	private static void Recursivesort(int[] nums, int i) {
		// TODO Auto-generated method stub
		if(i==nums.length-1) {
			return;
		}
		else {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			Recursivesort(nums, ++i);
		}
	}
	public static void main(String[] args) {
		int[] a= {5,2,3,1};
		System.out.println(sortArray(a));
	}
}
