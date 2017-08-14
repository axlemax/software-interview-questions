package maximumDifference;

import utilities.*;

public class Greedy {

	public static OutputInfo getMaximum(int[] numbers){
		OutputInfo outputInfo = new OutputInfo();
		outputInfo.algorithmName = "Greedy";
		
		int maximum = Integer.MIN_VALUE;
		
		// BEGIN
		outputInfo.startTime = System.nanoTime();
		
		int lowestSoFar = numbers[0];
		// Keep track of the greatest difference of the current value
		//  and the lowest value seen at that point
		for (int i = 1; i < numbers.length; i++){
			
			// Update maximum difference when needed
			if ((numbers[i] - lowestSoFar) > maximum)
				maximum = numbers[i] - lowestSoFar;
			
			// Update lowest value seen so far
			if (numbers[i] < lowestSoFar)
				lowestSoFar = numbers[i];
		}		
		
		// END
		outputInfo.endTime = System.nanoTime();
		outputInfo.result = maximum;
		
		return outputInfo;
	}

}
