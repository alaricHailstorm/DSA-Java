package dataStructure.BinaryTree;

import java.util.*;

public class BoundaryTraversal {
	
	public Boolean isLeaf(TreeNode root)
	{
		if(root.left == null && root.right == null)
			return true;
		
		return false;
	}
	
	public void addLeaf(TreeNode root, ArrayList<Integer> res)
	{
		if(root == null)	return;
		
		if(isLeaf(root)) res.add(root.data);
		addLeaf(root.left, res);
		addLeaf(root.right, res);
	}
	
	public void addLeftBoundary(TreeNode root, ArrayList<Integer> res)
	{
		TreeNode cur = root.left;
		while(cur != null)
		{
			if(!isLeaf(cur)) res.add(cur.data);
			if(cur.left != null) cur=cur.left;
			else cur=cur.right;
		}
	}
	
	public void addRightBoundary(TreeNode root, ArrayList<Integer> res)
	{
		ArrayList<Integer> tempAns = new ArrayList<Integer>();
		TreeNode cur= root.right;
		
		while(cur != null)
		{
			if(!isLeaf(cur))	tempAns.add(cur.data);
			
			if(cur.right != null) cur=cur.right;
			else	cur=cur.left;
		}
		
		for(int i=tempAns.size()-1; i>=0; i--)
		{
			res.add(tempAns.get(i));
		}
	}
	
	public List<Integer> boundaryTraversal(TreeNode root)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(root == null)	return ans;
		
		if(!isLeaf(root))	ans.add(root.data);
		
		addLeftBoundary(root, ans);
		addLeaf(root, ans);
		addRightBoundary(root, ans);
		return ans;
	}
}