package com.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorder {
	static List<Integer> res;
    public static List<Integer> preorderTraversal(TreeNode root) {
        res=new ArrayList<>();
    	Traversal(root);
        return res;
    }
	private static void Traversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			res.add(root.val);
			Traversal(root.left);
			Traversal(root.right);
		}
	}
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

	public static void main(String[] args) {
		TreeNode a=null;
//		TreeNode a=new TreeNode(1);
//		a.left=null;
//		TreeNode b=new TreeNode(2);
//		TreeNode c=new TreeNode(3);
//		a.right=b;
//		b.left=c;
		System.out.println(preorderTraversal(a));
	}
}
