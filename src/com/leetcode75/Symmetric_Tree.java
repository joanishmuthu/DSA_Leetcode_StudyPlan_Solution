package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;

public class Symmetric_Tree {
	static ArrayList<Integer> a;
    static ArrayList<Integer> b;
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
    public static boolean isSymmetric(TreeNode root) {
        a=new ArrayList<>();
        b=new ArrayList<>();
        
        Traversal1(root.left);
        Traversal2(root.right);
        Collections.reverse(b);

        if(a.equals(b)) {
        	return true;
        }
        else {
        	return false;
        }
    }
	private static void Traversal1(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			Traversal1(root.left);
			a.add(root.val);
			Traversal1(root.right);
		}
	}
	private static void Traversal2(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			
			return;
		}
		else {
			
			Traversal2(root.left);
			b.add(root.val);
			Traversal2(root.right);
			
		}
	}
	public static void main(String[] args) {
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(2);
		TreeNode d=new TreeNode(3);
		TreeNode e=new TreeNode(4);
		TreeNode f=new TreeNode(4);
		TreeNode g=new TreeNode(3);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		c.left=f;
		c.right=g;
		System.out.println(isSymmetric(a));
	}
}
