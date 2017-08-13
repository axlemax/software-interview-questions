package maximumDifference;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {

		long startTime, endTime;
		
		// Create a new array of random values
		int[] numbers = new int[5];
		for (int i = 0 ; i < numbers.length; i++){
			numbers[i] = ThreadLocalRandom.current().nextInt(1, 1000);
		}

		// Step 1 - Brute Force
		startTime = System.nanoTime();
		int bfMax = BruteForce.getMaximum(numbers);
		endTime = System.nanoTime();
		
		output("Brute Force", bfMax, startTime, endTime);
	}
	
	public static void output(String algorithmName, int result, long startTime, long endTime){
		System.out.println("Result reported by " + algorithmName +": " + result);
		System.out.println(" " + algorithmName + " time: " + (endTime - startTime) / 1000.0 / 1000.0 + " ms");
		System.out.println();
	}

}
