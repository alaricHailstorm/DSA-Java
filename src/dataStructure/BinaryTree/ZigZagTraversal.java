package dataStructure.BinaryTree;
import java.util.*;

public class ZigZagTraversal {
	public List<List<Integer>> zigZagTraversal(TreeNode root)
	{
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		if(root == null)
			return ans;
		
		q.add(root);
		
		Boolean ordered = false;
		
		while(!q.isEmpty())
		{
			int size = q.size();
			List<Integer> tempAns = new LinkedList<Integer>();
			for(int i=0; i<size; i++)
			{
				int index = i;
				TreeNode cur = q.poll();
				if(ordered == true)
				{
					index = size-i-1;
				}
				if(cur.left != null)
					q.add(cur.left);
				
				if(cur.right != null)
					q.add(cur.right);
				
				tempAns.add(index, cur.data);
				q.poll();
			}
			ordered=!ordered;
			ans.add(tempAns);
		}
		
		return ans;
	}
}
