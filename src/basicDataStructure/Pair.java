package basicDataStructure;
import dataStructure.BinaryTree.TreeNode;


public class Pair {
	int first;
	TreeNode second;
	
	public int getFirst() {
		return first;
	}

	public TreeNode getSecond() {
		return second;
	}

	public Pair(int a, TreeNode b) {
		this.first = a;
		this.second = b;
	}
}
