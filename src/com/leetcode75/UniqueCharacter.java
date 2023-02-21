package com.leetcode75;

public class UniqueCharacter {
    public static int firstUniqChar(String s) {
        String[] arr=s.split("");
        int index=10000;
    	for(int i=0;i<arr.length;i++) {
    		int count=0;
    		for(int j=0;j<arr.length;j++) {
    			if(i!=j) {
    				if(!arr[i].equals(arr[j])) {
    					count++;
    				}
    			}
    		}
    		if(count==arr.length-1 && count<index) {
    			index=i;
    		}
    	}
    	if(index==10000) {
    		return -1;
    	}
    	else {
    		return index;
    	}
    }
	public static void main(String[] args) {
		String s="aabb";
		System.out.println(firstUniqChar(s));
	}
}
