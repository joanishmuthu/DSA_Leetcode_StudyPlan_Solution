package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subarrays_with_fixed_bounds {
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
    	for(int i=0;i<nums.length;i++) {
        	if(nums[i]==minK) {
    			List<Integer> arr=new ArrayList<>();
        		for(int j=i;j<nums.length;j++) {
        			arr.add(nums[j]);
        			if(Collections.max(arr)==maxK && Collections.min(arr)==minK) {
        				count++;
        			}
        		}
        	}
        }
    	return count;
    }
	public static void main(String[] args) {
		int[] nums= {35054,398719,945315,945315,820417,945315,35054,945315,171832,945315,35054,109750,790964,441974,552913};
		int minK=35054;
		int maxK=945315;
		System.out.println(countSubarrays(nums, minK, maxK));
	}
}
