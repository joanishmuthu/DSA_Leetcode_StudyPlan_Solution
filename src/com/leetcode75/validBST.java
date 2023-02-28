package com.leetcode75;

import java.util.Stack;

public class validBST {
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

	static boolean res;

	public static boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;

		TreeNode curr = root;
		TreeNode prev = null;
		Stack<TreeNode> stack = new Stack<>();

		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			if (prev != null && curr.val <= prev.val)
				return false;

			prev = curr;
			curr = curr.right;
		}
		return true;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(1);
		TreeNode d = new TreeNode(3);
		root.left = a;
		root.right = b;
		a.left = c;
		a.right = d;
		System.out.println(isValidBST(root));
	}
}
