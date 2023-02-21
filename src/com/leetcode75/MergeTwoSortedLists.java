package com.leetcode75;

import com.leetcode75.LinkedListCycle.ListNode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        if(list1==null) {
        	return list2;
        }
        else if(list2==null) {
        	return list1;
        }
        else {
        	while(temp1!=null) {
        		if(temp1.next==null) {
        			temp1.next=temp2;
        			break;
        		}
        		temp1=temp1.next;
        	}
        	ListNode temp3=list1;
        	
        	while(temp3!=null) {
        		ListNode temp4=list1;
        		while(temp4!=null) {
        			if(temp3.val<temp4.val) {
        				int t=temp3.val;
        				temp3.val=temp4.val;
        				temp4.val=t;
        			}
        			temp4=temp4.next;
        		}
        		temp3=temp3.next;
        	}
        	return list1;
        }
    	
    }
	public static void main(String[] args) {
		ListNode root1=new ListNode(1);
		ListNode a=new ListNode(2);
		ListNode b=new ListNode(4);
		root1.next=a;
		a.next=b;
		
		ListNode root2=new ListNode(1);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(4);
		root2.next=c;
		c.next=d;
		mergeTwoLists(root1, root2);
	}
}
