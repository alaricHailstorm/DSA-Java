package dataStruture.queue.implementation;
import java.util.*;

public class SlidingWindowMax {
	/**
	 * Problem: Sliding Window Maximum
	 * **/
	public static ArrayList<Integer> solve(ArrayList<Integer> arr, int k)
	{
		Deque<Integer> st = new LinkedList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = arr.size(), i=0;
		while(i<=n)
		{
			if(!st.isEmpty() && st.peekFirst() == i-k)
				st.poll();
			
			while(st.size()>0 && (i==n || arr.get(st.peekLast()) < arr.get(i)))
			{
				st.pollLast();
			}
			if(i<n)
				st.addLast(i);
			if(i >= k-1 && st.size()>0)
			{
				ans.add(arr.get(st.peekFirst()));
			}
			i++;
		}
		return ans;
	}
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = in.nextInt(), k= in.nextInt();
		for(int i=0; i<n; i++)
		{
			arr.add(i, in.nextInt());
		}
	
		ArrayList<Integer> ans = solve(arr, k);
		for(int i=0; i<ans.size(); i++)
			System.out.print(ans.get(i)+" ");
		
		System.out.println();
		in.close();

	}

}
