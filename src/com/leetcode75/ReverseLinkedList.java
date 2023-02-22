package com.leetcode75;

import com.leetcode75.LinkedListCycle.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null) {
        	next=curr.next;
        	curr.next=prev;
        	prev=curr;
        	curr=next;
        	
        }
        return prev;
    }
	public static void main(String[] args) {
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(3);
		a.next=b;
		b.next=c;
		ListNode rev=reverseList(a);
	}
}
