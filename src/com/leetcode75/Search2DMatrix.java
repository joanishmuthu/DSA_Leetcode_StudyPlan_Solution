package com.leetcode75;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean found=false;
    	for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix[0].length;j++) {
        		if(matrix[i][j]==target) {
        			found=true;
        		}
        	}
        }
    	return found;
    }
	public static void main(String[] args) {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(matrix, 109));
	}
}
