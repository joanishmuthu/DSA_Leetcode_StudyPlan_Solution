package com.leetcode75;

import java.util.ArrayList;

public class Reshape {
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int[][] res = new int[r][c];
		ArrayList<Integer> arr=new ArrayList<>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				arr.add(mat[i][j]);
			}
		}
		int m=0;
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				res[i][j]=arr.get(m);
				m++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2 }, { 3, 4 } };
		int r = 3;
		int c = 1;
		int[][] res = matrixReshape(mat, r, c);
	}
}
