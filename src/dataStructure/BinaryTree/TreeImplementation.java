package dataStructure.BinaryTree;

import java.util.Scanner;

public class TreeImplementation {
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree();
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int val = in.nextInt();
			root.insert(val);
		}
		
//		root.inOrderTraversalRecursive(root.getRoot());
//		root.inOrderTraversalIterative();
//		root.preOrderTraversalRecursive(root.getRoot());
		root.postOrderRecursive(root.getRoot());
		System.out.println();
//		root.preOrderIterative();
		in.close();
	}
}
