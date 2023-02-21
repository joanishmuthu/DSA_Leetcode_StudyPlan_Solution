package com.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        res.add(a);
        while(res.size()<numRows) {
        	List<Integer> a1=new ArrayList<>();
        	if(res.size()+1==2) {
        		a1.add(1);
        		a1.add(1);
        		res.add(a1);
        	}
        	else {
        		a1.add(1);
        		List<Integer> a2=res.get(res.size()-1);
        		for(int i=0;i<a2.size()-1;i++) {
        			int sum=a2.get(i)+a2.get(i+1);
        			a1.add(sum);
        		}
        		a1.add(1);
        		res.add(a1);
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		int num=1;
		List<List<Integer>> res=generate(num);
		System.out.println(res);
	}
}
