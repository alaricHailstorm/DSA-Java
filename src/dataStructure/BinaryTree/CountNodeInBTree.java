package dataStructure.BinaryTree;

public class CountNodeInBTree {
	/**
	 * Given a complete binary tree and out task is to calculate the number of nodes in 
	 * that tree.
	 * Time complexity should be O(log^2 N)
	 * Space Complexity should be O(log n)
	 * **/
	public int getHeight(TreeNode root, int fl)
	{
		if(root == null)
			return 0;
		
		TreeNode cur = root;
		int height=0;
		while(cur != null)
		{
			if(fl ==0)
				cur=cur.left;
			else
				cur=cur.right;
			height++;
		}
		return height;
	}
	
	public int countNodes(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int lh = getHeight(root, 0);
		int rh = getHeight(root, 1);
		
		if(lh == rh)
		{
			return (int) Math.pow(2, lh) - 1;
		}else
		{
			int leftNodeCount = countNodes(root.left);
			int rightNodeCount = countNodes(root.right);
			
			return 1+leftNodeCount+rightNodeCount;
		}
	}
}
