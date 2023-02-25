package dataStructure.BinaryTree;
import basicDataStructure.Pair;
import java.util.*;
import java.util.Map.Entry;


public class VerticalTraversal {
	public ArrayList<Integer> verticalTraversal(TreeNode root)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(root == null)
			return ans;
		
		Queue<Pair> q = new LinkedList<Pair>();
		HashMap<Integer, ArrayList<Integer>> map= new HashMap<Integer, ArrayList<Integer>>();
		q.add(new Pair(0, root));
		
		while(!q.isEmpty())
		{
			int size = q.size();
			for(int i=0; i<size; i++)
			{
				int vidx = q.peek().getFirst();
				TreeNode cur = q.peek().getSecond();
				
				ArrayList<Integer> list = map.get(vidx);
				list.add(cur.data);
				map.put(vidx, list);
				
				if(cur.left != null)
					q.add(new Pair(vidx-1, cur.left));
				
				if(cur.right != null)
					q.add(new Pair(vidx+1, cur.right));
				
			}
		}
		
		ArrayList<Integer> vidx_list = new ArrayList<Integer>(map.keySet());
		Collections.sort(vidx_list);
		for(Integer val: vidx_list)
		{
            int vidx = val.intValue();
            ArrayList<Integer> list = map.get(vidx);
            for(int i=0; i<list.size(); i++)
            {
            	System.out.print(list.get(i)+" ");
            }
            System.out.println();
		}
		
		return ans;
	}
}
