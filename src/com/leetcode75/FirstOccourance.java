package com.leetcode75;

public class FirstOccourance {
    public static int strStr(String haystack, String needle) {
        int p=-1;
    	for(int i=0;i<haystack.length()-needle.length()+1;i++) {
        	String k=haystack.substring(i, i+needle.length());
        	if(needle.equals(k)) {
        		p=i;
        		break;
        	}
        }
    	if(needle.length()==1 && haystack.length()==1) {
    		if(needle.equals(haystack)) {
    			p=0;
    		}
    	}
    	return p;
    }
	public static void main(String[] args) {
		String s="sadbutsad";
		System.out.println(strStr(s, "sad"));
	}
}
