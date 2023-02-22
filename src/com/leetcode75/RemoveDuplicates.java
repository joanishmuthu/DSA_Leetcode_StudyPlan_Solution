package com.leetcode75;

import com.leetcode75.LinkedListCycle.ListNode;

public class RemoveDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        ListNode next=null;
        int count=0;
        while(temp!=null && temp.next!=null) {
        	next=temp.next;
        	if(temp.val==next.val && prev==null) {
        		count=1;
        	}
        	else if(temp.val==next.val && prev!=null) {
        		prev.next=next;
        	}
        	prev=temp;
        	temp=temp.next;
        }
        if(count==1) {
        	return head.next;
        }
        else {
        	return head;
        }
        
    }
	public static void main(String[] args) {
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(1);
		ListNode c=new ListNode(1);
		ListNode d=new ListNode(1);
		ListNode e=new ListNode(3);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		ListNode res=deleteDuplicates(a);
	}
}
