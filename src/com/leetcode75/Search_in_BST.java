package com.leetcode75;

public class Search_in_BST {
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
	static TreeNode res;
    public static TreeNode searchBST(TreeNode root, int val) {
        RecursiveSearch(root,val);
        return res;
    }
	private static void RecursiveSearch(TreeNode root, int val) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			if(root.val==val) {
				res=root;
				return;
			}
			else if(root.val<val) {
				RecursiveSearch(root.right, val);
			}
			else if(root.val>val) {
				RecursiveSearch(root.left, val);
			}
			
		}
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
		System.out.println(searchBST(root, 5));
	}
}
