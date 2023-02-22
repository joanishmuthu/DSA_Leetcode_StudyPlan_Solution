package com.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class NumbersWithRepeatingDigits {
	static int count=0;
	static Map<Integer, Integer> m=new HashMap<>();
    public static int numDupDigitsAtMostN(int n) {
        for(int i=1;i<=n;i++) {
        	String a=Integer.toString(i);
        	int b=a.length();
        	duplicate(i,b);
        }
        return count;
    }
	private static void duplicate(int i,int a) {
		// TODO Auto-generated method stub
		if(0==a) {
			m.clear();
			return;
		}
		else {
			int p=i%10;
			int q=i/10;
			if(m.containsKey(p)) {
				count++;
			}
			else {
				m.put(p, 1);
			}
			duplicate(q,--a);
		}
	}
	public static void main(String[] args) {
		int n=100;
		System.out.println(numDupDigitsAtMostN(n));
	}
}
