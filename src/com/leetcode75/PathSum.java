package com.leetcode75;

import java.nio.file.Path;

public class PathSum {
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
	static int count=0;
	static boolean result;
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		result=false;
		PathSum1(root,targetSum,0);
		return result;
	}

	private static void PathSum1(TreeNode root, int targetSum, int i) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			i=i+root.val;
			if(targetSum==i && count==0) {
				count++;
				result=true;
			}
			PathSum1(root.left, targetSum, i);
			PathSum1(root.right, targetSum, i);
		}
	}

	public static void main(String[] args) {
//		TreeNode a = new TreeNode(5);
//		TreeNode b = new TreeNode(4);
//		TreeNode c = new TreeNode(8);
//		TreeNode d = new TreeNode(11);
//		TreeNode e = new TreeNode(13);
//		TreeNode f = new TreeNode(4);
//		TreeNode g = new TreeNode(7);
//		TreeNode h = new TreeNode(2);
		TreeNode i = new TreeNode(1);
//		a.left = b;
//		a.right = c;
//		b.left = d;
//		c.left = e;
//		c.right = f;
//		d.left = g;
//		d.right = h;
//		f.right = i;
		System.out.println(hasPathSum(i, 1));
	}
}
