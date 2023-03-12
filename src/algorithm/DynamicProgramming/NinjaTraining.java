package algorithm.DynamicProgramming;

public class NinjaTraining {
	
	public int getMaximumTraining(int arr[][], int day, int last)
	{
		if(day < 0)
			return 0;
		
		int maxM = Integer.MIN_VALUE;
		for(int i=0; i<3; i++)
		{
			if(i != last)
			{
				maxM = Math.max(maxM, arr[day][i]+getMaximumTraining(arr, day-1, i));
			}
		}
		return maxM;
	}
}
