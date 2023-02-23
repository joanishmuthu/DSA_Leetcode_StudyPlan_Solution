package com.leetcode75;

public class IPO {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int i=0;
        int temp=0;
    	while(i<capital.length) {
    		if(i==w) {
    			int temp1=profits[i]+w;
    			if(temp1>temp) {
    				temp=temp1;
    			}
    			
    		}
    		if(i==capital.length-1) {
    			w=temp;
    			k--;
    		}
    		
    		if(i==capital.length-1 && k!=0) {
    			i=0;
    		}
    		else {
    			i++;
    		}
    	}
    	return w;
    }
	public static void main(String[] args) {	
		int k=3;
		int w=0;
		int[] profits= {1,2,3};
		int[] capital= {0,1,2};
		System.out.println(findMaximizedCapital(k, w, profits, capital));
	}
}
