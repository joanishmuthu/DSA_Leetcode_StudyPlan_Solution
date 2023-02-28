package com.leetcode75;

import java.util.ArrayList;

public class TwoSumBST {
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
	static ArrayList<Integer> arr=new ArrayList<>();
    public static boolean findTarget(TreeNode root, int k) {
        Recursive(root);
        boolean res=false;
        for(int i=0;i<arr.size();i++) {
        	for(int j=0;j<arr.size();j++) {
        		if(i!=j) {
        			if(arr.get(i)+arr.get(j)==k) {
        				res=true;
        			}
        		}
        	}
        }
        return res;
    }
	private static void Recursive(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			arr.add(root.val);
			Recursive(root.left);
			Recursive(root.right);
		}
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
//		TreeNode a=new TreeNode(2);
//		TreeNode b=new TreeNode(7);
//		TreeNode c=new TreeNode(1);
//		TreeNode d=new TreeNode(3);
//		root.left=a;
//		root.right=b;
//		a.left=c;
//		a.right=d;
		System.out.println(findTarget(root, 4));
	}
}
