package com.leetcode75;

import java.util.Arrays;

public class MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        System.arraycopy(nums1, 0, res, 0, m);
        System.arraycopy(nums2, 0, res, m, n);
        Arrays.sort(res);
        nums1=new int[m+n];
        for(int i=0;i<res.length;i++) {
        	nums1[i]=res[i];
        }
        for(int i=0;i<nums1.length;i++) {
        	System.out.println(nums1[i]);
        }
    }
	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int m=3;
		int[] nums2= {2,5,6};
		int n=3;
		merge(nums1, m, nums2, n);
	}
}
