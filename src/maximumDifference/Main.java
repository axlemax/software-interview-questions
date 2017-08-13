package maximumDifference;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		// Create a new array of random values
		int[] numbers = new int[100000];
		for (int i = 0 ; i < numbers.length; i++){
			numbers[i] = ThreadLocalRandom.current().nextInt(-1000000, 1000000 + 1);
		}

		// Step 1 - Brute Force	-> O(n^2)	
		output(BruteForce.getMaximum(numbers));		
		
		// Step 2 - Greedy -> O(n)
		output(Greedy.getMaximum(numbers));
	}
	
	public static void output(OutputInfo outputInfo){
		System.out.println("Result reported by " + outputInfo.algorithmName +": " + outputInfo.result);
		System.out.println(" " + outputInfo.algorithmName + " time: " + (outputInfo.endTime - outputInfo.startTime) / 1000.0 / 1000.0 + " ms");
		System.out.println();
	}
	
	public static class OutputInfo {
		String algorithmName;
		int result;
		long startTime;
		long endTime;
	}

}
