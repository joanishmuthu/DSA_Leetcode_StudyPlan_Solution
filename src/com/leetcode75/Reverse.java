package com.leetcode75;

public class Reverse {
	static int res = 0;

	public static int reverse(int x) {
		if (x < Math.pow(-2, 31) || x > Math.pow(2, 31)) {
			return -1;
		} else {
			int m=Math.abs(x);
			String a = Integer.toString(m);
			reversing(m, a.length());
			if (x < 0) {
				return -1*res;
			}
			else {
				return res;
			}
		}
	}

	private static void reversing(int x, int len) {
		// TODO Auto-generated method stub
		if (len == 0) {
			return;
		} else {
			int c = x % 10;
			res = res + (c * ((int) Math.pow(10, len - 1)));
			reversing(x / 10, --len);
		}
	}

	public static void main(String[] args) {
		int a = -123;
		System.out.println(reverse(a));
	}
}
