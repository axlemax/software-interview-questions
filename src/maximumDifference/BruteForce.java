package maximumDifference;

import utilities.*;

public class BruteForce {

	public static OutputInfo getMaximum(int[] numbers){
		OutputInfo outputInfo = new OutputInfo();
		outputInfo.algorithmName = "Brute Force";
		
		int maximum = Integer.MIN_VALUE;
		
		// BEGIN
		outputInfo.startTime = System.nanoTime();
		
		// Compare every value to every other value in the array
		//  that follows that number's location
		for (int currentValue = 0; currentValue < numbers.length; currentValue++){
			for (int compareValue = numbers.length - 1; compareValue >  currentValue; compareValue--){
				
				// Compare to maximum found so far, update if larger
				if ((numbers[compareValue] - numbers[currentValue]) > maximum)
					maximum = numbers[compareValue] - numbers[currentValue];
			}
		}
		
		// END
		outputInfo.endTime = System.nanoTime();
		outputInfo.result = maximum;
		
		return outputInfo;
	}

}
