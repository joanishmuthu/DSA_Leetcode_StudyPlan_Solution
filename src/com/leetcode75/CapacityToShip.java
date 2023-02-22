package com.leetcode75;

public class CapacityToShip {
    public static int shipWithinDays(int[] weights, int D) {
    	int left = 0, right = 0;
        for (int w: weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, requirement = 1, tillnow = 0;
            for (int w: weights) {
                if (tillnow + w > mid) {
                   requirement += 1;
                   tillnow = 0;
                }
                tillnow += w;
            }
            if (requirement > D) left = mid + 1;
            else right = mid;
        }
        return left;
    }
	public static void main(String[] args) {
		int[] weights= {3,2,2,4,1,4};
		System.out.println(shipWithinDays(weights, 3));
	}
}
