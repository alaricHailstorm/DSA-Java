package inputOutput;

import algorithm.DynamicProgramming.NinjaTraining;
import java.util.Scanner;

public class NinjaProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		int arr[][] =  new int[n][3];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		
		NinjaTraining nj = new NinjaTraining();
		int ans = nj.getMaximumTraining(arr, n-1, -1);
		System.out.println(ans+"");
		
		in.close();
	}

}
