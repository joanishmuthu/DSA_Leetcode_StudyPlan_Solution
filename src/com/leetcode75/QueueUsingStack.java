package com.leetcode75;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> a;
	Stack<Integer> b;
	public QueueUsingStack() {
		this.a=new Stack<>();
		this.b=new Stack<>();
	}

	public void push(int x) {
		a.add(x);
	}

	public int pop() {
		while(!a.isEmpty()) {
			b.add(a.pop());
		}
		int c=b.pop();
		while(!b.isEmpty()) {
			a.add(b.pop());
		}
		return c;
	}

	public int peek() {
		while(!a.isEmpty()) {
			b.add(a.pop());
		}
		int c=b.peek();
		while(!b.isEmpty()) {
			a.add(b.pop());
		}
		return c;
	}

	public boolean empty() {
		boolean res;
		if(a.isEmpty()) {
			res=true;
		}
		else {
			res=false;
		}
		return res;
	}

	public static void main(String[] args) {
		QueueUsingStack qs=new QueueUsingStack();
		qs.push(1);
		qs.push(2);
		qs.push(3);
		qs.push(4);
		System.out.println(qs.peek());
	}
}
