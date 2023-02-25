package com.leetcode75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	static Queue<TreeNode> s1=new ArrayDeque<>();
	static List<List<Integer>> res;
	static List<Integer> temp;
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

	public static List<List<Integer>> levelOrder(TreeNode root) {
		res=new ArrayList<>();
		List<Integer> n=new ArrayList<>();
		if(root==null) {
			return res;
		}
		else {
			n.add(root.val);
			res.add(n);
			traversal(root);
			return res;
		}
	}
	private static void traversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			temp=new ArrayList<>();
			if(root.left!=null && root.right!=null) {
				temp.add(root.left.val);
				temp.add(root.right.val);
				res.add(temp);
				s1.add(root.left);
				s1.add(root.right);
				traversal(root.left);
				traversal(root.right);
				
			}
			else if(root.left!=null && root.right==null) {
				temp.add(root.left.val);
				res.add(temp);
				traversal(root.left);
			}
			else if(root.left==null && root.right!=null) {
				temp.add(root.right.val);
				res.add(temp);
				traversal(root.right);
			}
			
		}
	}
	public static void main(String[] args) {
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(3);
		TreeNode d=new TreeNode(4);
		TreeNode e=new TreeNode(5);
		a.left=b;
		a.right=c;
		b.left=d;
		c.right=e;
		System.out.println(levelOrder(a));
	}
}
