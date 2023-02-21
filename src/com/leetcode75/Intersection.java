package com.leetcode75;

import java.util.ArrayList;

public class Intersection {
	public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<nums1.length;i++) {
        	for(int j=0;j<nums2.length;j++) {
        		if(nums1[i]==nums2[j]) {
        			arr.add(nums1[i]);
        			nums1[i]=0;
        			nums2[j]=0;
        			break;
        		}
        	}
        }
		int[] res=new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			res[i]=arr.get(i);
		}
		return res;
    }	
	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2};
		int[] res=intersect(nums1,nums2);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	
}
