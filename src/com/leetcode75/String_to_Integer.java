package com.leetcode75;

public class String_to_Integer {
	public static int myAtoi(String s) {
		s.trim();
		char[] m=s.toCharArray();
		boolean neg=false;
		for(int i=0;i<m.length;i++) {
			if(Character.isAlphabetic(m[i])) {
				m[i]=' ';
			}
			if(i!=m.length-1 && m[i]=='-') {
				if(Character.isDigit(m[i+1])){
					neg=true;
				}
				m[i]=' ';
			}
		}
		String h=new String(m);
		String po=h.trim();
		if(neg==true) {
			return -1*(Integer.parseInt(po));
		}
		return Integer.parseInt(po);
	}

	public static void main(String[] args) {
		String s = "words and 987";
		System.out.println(myAtoi(s));
	}
}
