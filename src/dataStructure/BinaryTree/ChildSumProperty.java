package dataStructure.BinaryTree;

public class ChildSumProperty {
	public int childSumProperty(TreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return root.data;
		
		int left = childSumProperty(root.left);
		int right = childSumProperty(root.right);
		
		if((left+right) > root.data)
		{
			root.data = left+right;
		}else if(root.data > (left+right))
		{
			if(root.left != null && root.right != null)
			{
				root.left.data = root.data - root.right.data;
			}else if(root.left == null)
			{
				root.right.data = root.data;
			}else
			{
				root.left.data = root.data;
			}
		} 
		return root.data;
	}
}
