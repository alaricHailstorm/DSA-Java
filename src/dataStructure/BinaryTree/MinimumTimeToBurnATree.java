package dataStructure.BinaryTree;
import java.util.*;

public class MinimumTimeToBurnATree {
	public int minimumTimeToBurn(TreeNode root, TreeNode point)
	{
		if(root == null || point== null)
			return 0;
		
		HashMap<Integer, TreeNode> par = new HashMap<Integer, TreeNode>();
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.add(root);
		par.put(root.data, null);
		
		while(q.isEmpty() == false)
		{
			int size = q.size();
			for(int i=0; i<size; i++)
			{
				TreeNode cur = q.peek();
				q.poll();
				
				if(cur.left != null)
				{
					par.put(cur.left.data, cur); 
					q.add(cur.left);
				}
				
				if(cur.right != null)
				{
					par.put(cur.right.data, cur);
					q.add(cur.right);
				}
			}
		}
		
		q.add(point);
		int dis = 0;
		HashMap<TreeNode, Integer> vis = new HashMap<TreeNode, Integer>();
		
		while(q.isEmpty() == false)
		{
			int size = q.size();
			int fl =0;
			for(int i=0; i<size; i++)
			{
				TreeNode cur = q.peek();
				q.poll();
				
				if(par.get(cur.data) != null && vis.get(par.get(cur.data)) == null)
				{
					fl=1;
					vis.put(par.get(cur.data), 1);
					q.add(par.get(cur.data));
				}
				
				if(cur.left != null && vis.get(cur.left) == null)
				{
					fl=1;
					vis.put(cur.left, 1);
					q.add(cur.left);
				}
				
				if(cur.right != null && vis.get(cur.right)== null)
				{
					fl=1;
					vis.put(cur.right, 1);
					q.add(cur.right);
				}
			}
			
			if(fl==1)
				dis++;
		}
		return dis;
	}
}
