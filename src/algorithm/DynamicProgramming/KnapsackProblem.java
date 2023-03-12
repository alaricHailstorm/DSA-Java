package algorithm.DynamicProgramming;

public class KnapsackProblem {
	public int dp[][];
	
	public KnapsackProblem(int n, int cap) {
		this.dp = new int[n+1][cap+1];
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=cap; j++)
			{
				this.dp[i][j] = -1;
				if( i==0 || j ==0)
					this.dp[i][j] = 0;
			}	
		}
	}
	
	public int maximumProfitIterative(int wt[], int price[], int cap, int n)
	{
		for(int i=1; i<n+1; i++)
		{
			for(int j=1; j<cap+1; j++)
			{
				int maxProfit = dp[i-1][j];
				if(wt[i-1] <= j)
				{
					maxProfit = Math.max(maxProfit, price[i-1] + dp[i-1][j - wt[i-1]]);
				}
				dp[i][j] = maxProfit;
			}
		}
		return dp[n][cap];
	}
	
	public int maximumProfit(int wt[], int price[], int capacity, int n)
	{
		if(n<0)
			return 0;
		int max_sum = maximumProfit(wt, price, capacity, n-1);
		
		if(dp[n][capacity] != -1)
			return dp[n][capacity];
		
		if(capacity >= wt[n])
			max_sum = Math.max(max_sum, 
					price[n]+maximumProfit(wt, price, capacity-wt[n], n-1));
		
		return dp[n][capacity] = max_sum;
	}
}
