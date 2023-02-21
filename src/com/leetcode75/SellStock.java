package com.leetcode75;

public class SellStock {
    public static int maxProfit(int[] prices) {
        int[][] a=new int[prices.length][prices.length];
        int max=0;
        for(int i=0;i<prices.length;i++) {
        	for(int j=i;j<prices.length;j++) {
        		a[i][j]=prices[j]-prices[i];
        		if(a[i][j]>max) {
        			max=a[i][j];
        		}
        	}
        }
        return max;
    }
	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
}
