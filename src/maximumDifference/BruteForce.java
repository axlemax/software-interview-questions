package maximumDifference;

public class BruteForce {

	public static int getMaximum(int[] numbers){
		int maximum = Integer.MIN_VALUE;
		
		// Compare every value to every other value in the array
		//  that follows that number
		for (int currentValue = 0; currentValue < numbers.length; currentValue++){
			for (int compareValue = numbers.length - 1; compareValue >  currentValue; compareValue--){
				
				// Compare to maximum found so far, update if larger
				if ((numbers[compareValue] - numbers[currentValue]) > maximum)
					maximum = numbers[compareValue] - numbers[currentValue];
			}
		}
		
		return maximum;
	}

}
