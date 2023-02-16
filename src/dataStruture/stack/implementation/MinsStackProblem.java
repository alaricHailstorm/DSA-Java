package dataStruture.stack.implementation;

import java.util.Scanner;

public class MinsStackProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i]=in.nextInt();
		
		MinStack mns = new MinStack();
		for(int i=0; i<n; i++)
			mns.push(arr[i]);
		
		while(!mns.isEmpty())
		{
			int min = mns.getMin();
			mns.pop();
			System.out.println(min);
		}
		
		in.close();
	}
}
