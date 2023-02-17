package dataStructure.BinaryTree;

public class BalancedTree {
	
	public int checkBalancedOptimized(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int left = checkBalancedOptimized(root.left);
		int right = checkBalancedOptimized(root.right);
		
		if(left == -1)
			return -1;
		
		if(right == -1)
			return -1;
		
		return Math.max(left, right)+1;
	}
	
	public int checkBalanced(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int left = checkBalancedOptimized(root.left);
		int right = checkBalancedOptimized(root.right);
		
		return Math.max(left, right)+1;
	}
	public Boolean isBalance(TreeNode root)
	{
		 if(root == null) return true;
			Boolean lbal = isBalance(root.left);
			Boolean rbal = isBalance(root.right);

	        if(lbal == false)
	            return false;
	        
	        if(rbal== false)
	            return false;
			
			int left = checkBalanced(root.left);
			int right = checkBalanced(root.right);
			
			if(Math.abs(left-right)>1)
				return false;
			
			return true;
		
	}
	public Boolean isBalanced(TreeNode root)
	{
		if(root == null)	return false;
		if(checkBalancedOptimized(root) != -1)	return true;
		return false;
	}
}
