package dataStructure.BinaryTree;

public class MaxPathSum {

	public int getPathSum(TreeNode root, int max[])
	{
		if(root == null)	return 0;
		
		int leftSum = Math.max(getPathSum(root.left, max), 0);
		int rightSum = Math.max(getPathSum(root.right, max), 0);
		
		max[0] = Math.max(leftSum+rightSum+root.data, max[0]);
		return Math.max(leftSum, rightSum) +root.data;
	}
	
	public int maxPathSum(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int max[]=new int[1];
		max[0]=Integer.MIN_VALUE;
		
		getPathSum(root, max);
		return max[0];
	}

}
