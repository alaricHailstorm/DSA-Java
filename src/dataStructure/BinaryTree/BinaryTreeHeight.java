package dataStructure.BinaryTree;

import java.util.Scanner;

public class BinaryTreeHeight {
	
	public static int getHeight(TreeNode root) {
		if(root==null)
			return 0;
		
		int left = 1+getHeight(root.left);
		int right = 1+getHeight(root.right);
		
		return Math.max(left, right);
	}
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree();
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int val = in.nextInt();
			root.insert(val);
		}
		
		int height = getHeight(root.getRoot());
		System.out.println(height);
		in.close();
	}
}
