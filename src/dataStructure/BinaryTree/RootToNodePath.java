package dataStructure.BinaryTree;

import java.util.ArrayList;

public class RootToNodePath {
	public ArrayList<ArrayList<Integer>> ans;
    public ArrayList<Integer> path;
    public int len;
    
    public void reset(){
        this.path = new ArrayList<Integer>();
        this.ans = new ArrayList<ArrayList<Integer>>();
        len =0;
    }

	public Boolean check(TreeNode root, int nodeValue, ArrayList<Integer> path)
	{
		if(root == null)
			return false;
		
		
		if(root.data == nodeValue)
			return true;
		
		Boolean isTrue = check(root.left, nodeValue, path) || check(root.right, nodeValue, path);
		
		path.add(root.data);
		
		if(isTrue == true)
			return true;
		else {
			path.remove(path.size()-1);
		}
		return false;
	}
}
