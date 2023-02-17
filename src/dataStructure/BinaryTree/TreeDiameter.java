package dataStructure.BinaryTree;

public class TreeDiameter {
	
	public int getHeight(TreeNode root, int ans[])
	{
		if(root == null)	return 0;
		int left = getHeight(root.left, ans);
		int right = getHeight(root.right, ans);
		
		ans[0] = Math.max(ans[0], left+right+1);
		
		return Math.max(left, right)+1;
		
	}
	public int getTreeDiameter(TreeNode root)
	{
		if(root == null)	return 0;
		
		int ans[] = new int[1];
		
		getHeight(root, ans);
		
		return ans[0]-1;
	}
}
