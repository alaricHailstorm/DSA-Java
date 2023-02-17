package dataStructure.BinaryTree;
import java.util.*;

public class BinaryTree {
	TreeNode root;
	int size = 0;
	public BinaryTree() {
		this.root = null;
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	public void insert(int value){
		TreeNode node = new TreeNode(value), temp = this.root;
		if(this.root == null)
		{
			this.root = node;
		}else
		{
			Queue<TreeNode> q= new LinkedList<TreeNode>();
			q.add(temp);
			
			while(!q.isEmpty())
			{
				TreeNode cur = q.poll();
				if(cur.left == null)
				{
					cur.left = node;
					return;
				}
				
				if(cur.right == null)
				{
					cur.right = node;
					return;
				}
				
				q.add(cur.left);
				q.add(cur.right);
			}
		}
	}
	
	public void inOrderTraversalRecursive(TreeNode head)
	{
		if(head == null)
			return;
		
		TreeNode cur = head;
		inOrderTraversalRecursive(cur.left);
		System.out.print(cur.data+" ");
		inOrderTraversalRecursive(cur.right);
		
	}
	
	public void preOrderTraversalRecursive(TreeNode root) {
		if(root==null)
			return;
		
		System.out.print(root.data + " ");
		preOrderTraversalRecursive(root.left);
		preOrderTraversalRecursive(root.right);
	}
	
	public void postOrderRecursive(TreeNode root)
	{
		if(root==null)
			return;
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data+" ");
	}
	
	
	public void preOrderIterative()
	{
		TreeNode cur = this.root;
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		while(cur!=null || !st.isEmpty())
		{

				
			while(cur!=null)
			{
				System.out.print(cur.data+" ");
				st.push(cur);
				cur=cur.left;
			}
			cur=st.pop();
			cur=cur.right;
			
		}
	}
	public void inOrderTraversalIterative()
	{
		TreeNode cur = this.root;
		Stack<TreeNode> st = new Stack<TreeNode>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while(cur!=null || !st.isEmpty())
		{
			while(cur!=null)
			{
				st.push(cur);
				cur=cur.left;
			}
			
			cur = st.pop();
			ans.add(cur.data);
			
			cur=cur.right;
		}
		
		for(int i=0; i<ans.size(); i++)
		{
			System.out.print(ans.get(i)+" ");
		}
	}
}
