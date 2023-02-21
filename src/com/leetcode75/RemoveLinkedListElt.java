package com.leetcode75;

import com.leetcode75.LinkedListCycle.ListNode;

public class RemoveLinkedListElt {
	
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode prev=null;
        int count=0;
        while(temp!=null ) {
        	
        	if(temp.val==val && temp.next!=null && prev==null) {
        		head=temp.next;
        		prev=head;
            	temp=head.next;
        	}
        	else if(temp.val==val && temp.next!=null) {
        		prev.next=temp.next;
        		prev=temp;
            	temp=temp.next;
        	}
        	else if(temp.val==val && temp.next==null) {
        		prev.next=null;
        		prev=temp;
            	temp=temp.next;
        	}
           	
        }
        System.out.println();
        if(count>0) {
        	return head.next;
        }
        else {
        	return head;
        }
        
    }
	public static void main(String[] args) {
		ListNode root = new ListNode(7);
		ListNode a = new ListNode(7);
		ListNode b = new ListNode(7);
		ListNode c = new ListNode(7);
		ListNode d=new ListNode(7);
		ListNode e=new ListNode(7);
		ListNode f=new ListNode(7);
		
		root.next = a;
		a.next = b;
		b.next = c;
		c.next=d;
		d.next=e;
		e.next=f;
		removeElements(root, 7);
	}
}
