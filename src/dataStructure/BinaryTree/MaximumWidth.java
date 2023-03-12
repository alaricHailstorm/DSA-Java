package dataStructure.BinaryTree;
import java.util.*;
import basicDataStructure.Pair;

public class MaximumWidth {
	
	public int getMaximumWidth(TreeNode root)
	{
		if(root == null)
			return 0;
		
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(0, root));
		
		int width = 1;
		
		while(q.isEmpty() == false) {
			int size = q.size();
			int lMin =Integer.MAX_VALUE, rMax = Integer.MIN_VALUE;
			for(int i=0; i<q.size(); i++)
			{
				TreeNode cur = q.peek().getSecond();
				int cur_idx = q.peek().getFirst();
				
				q.poll();
				
				if(cur.left != null)
				{
					lMin = Math.min(lMin, 2*cur_idx+1);
				}
				
				if(cur.right != null)
				{
					rMax = Math.max(rMax, 2*(cur_idx+1));
				}
			}
			
			if(lMin != Integer.MAX_VALUE || rMax != Integer.MIN_VALUE)
			{
				width = Math.max(width, rMax-lMin); 
			}
		}
		
		return width;
	}
}
