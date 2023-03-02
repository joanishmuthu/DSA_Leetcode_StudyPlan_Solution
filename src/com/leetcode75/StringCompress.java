package com.leetcode75;

import java.util.HashMap;

public class StringCompress {
    public static int compress(char[] chars) {
    	HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<chars.length;i++) {
        	int count=1;
        	for(int j=0;j<chars.length;j++) {
        		if(i!=j) {
        			if(chars[i]==chars[j]) {
        				count++;
        			}
        		}
        	}
        	if(!hm.containsKey(chars[i])) {
        		hm.put(chars[i], count);
        	}
        	count=0;
        }
        char[] p=hm.toString().toCharArray(); 
        for(int i=0;i<p.length;i++) {
        	if(Character.isAlphabetic(p[i]) || Character.isDigit(p[i])) {
        		continue;
        	}
        	else {
        		p[i]='0';
        	}
        }
        char[]res=new char[hm.size()*2];
        int k=0;
        for(int i=0;i<p.length;i++) {
        	if(p[i]!='0') {
        		res[k]=p[i];
        		k++;
        	}
        }
        chars=res;
        return hm.size()*2;
    }
	public static void main(String[] args) {
		char[] c= {'a','a','b','b','c','c','c'};
		System.out.println(compress(c));
	}
}
