package com.leetcode75;

public class LinkedListCycle {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		ListNode root = new ListNode(3);
//		ListNode a = new ListNode(2);
//		ListNode b = new ListNode(0);
//		ListNode c = new ListNode(-4);
//		root.next = a;
//		a.next = root;
//		b.next = c;
//		c.next = a;
		System.out.println(hasCycle(root));
	}

    public static boolean hasCycle(ListNode head) {
    	ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
