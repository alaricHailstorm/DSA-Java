package inputOutput;
import algorithm.DynamicProgramming.KnapsackProblem;

import java.util.Scanner;

public class InputOutput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int wt[] = new int[n], price[]= new int[n];
		for(int i=0; i<n; i++)
			wt[i]=sc.nextInt();
		
		for(int i=0; i<n; i++)
			price[i]=sc.nextInt();
		
		int capacity = sc.nextInt();
		KnapsackProblem solve = new KnapsackProblem(n, capacity);
		
		int ans = solve.maximumProfitIterative(wt, price, capacity, n);
		System.out.println(""+ans);
	
		
		sc.close();
	}
}
