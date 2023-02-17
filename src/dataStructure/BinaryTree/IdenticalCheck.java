package dataStructure.BinaryTree;

public class IdenticalCheck {
	public Boolean checkIdentical(TreeNode a, TreeNode b)
	{
		if(a==null && b==null)
			return true;
		if(a==null && b!=null)
			return false;
		if(a!=null && b==null)
			return false;
		
		if(a==b)
			return checkIdentical(a.left, b.left) && checkIdentical(a.right, b.right);
		
		return false;
	}
}
