package com.leetcode75;

import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		Stack<Character> c = new Stack<>();
		boolean res = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				c.push(s.charAt(i));
			} else {
				if(c.isEmpty()) {
					res=false;
				}
				else if (s.charAt(i) == ']') {
					if (c.peek() == '[') {
						c.pop();
					} else {
						res = false;
					}
				} else if (s.charAt(i) == ')') {
					if (c.peek() == '(') {
						c.pop();
					} else {
						res = false;
					}
				} else if (s.charAt(i) == '}') {
					if (c.peek() == '{') {
						c.pop();
					} else {
						res = false;
					}
				}
			}
		}
		if (!c.isEmpty()) {
			res = false;
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "(]";
		System.out.println(isValid(s));
	}
}
