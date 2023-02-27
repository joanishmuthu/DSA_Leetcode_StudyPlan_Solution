package com.leetcode75;

public class Insert_Into_BST {
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
	public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) {
        	root=new TreeNode(val);
        	return root;
        }
        else {
        	if(val<root.val) {
        		root.left= insertIntoBST(root.left, val);
        	}
        	else if(val>root.val) {
        		root.right=insertIntoBST(root.right, val);
        	}
        	
        }
		return root;
    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
		TreeNode a=new TreeNode(2);
		TreeNode b=new TreeNode(7);
		TreeNode c=new TreeNode(1);
		TreeNode d=new TreeNode(3);
		root.left=a;
		root.right=b;
		a.left=c;
		a.right=d;
		System.out.println(insertIntoBST(root, 9));
		System.out.println();
	}
}
