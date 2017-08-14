package maximumDifference;

import java.util.concurrent.ThreadLocalRandom;
import utilities.*;

public class Main {

	public static void main(String[] args) {
		
		// Create a new array of random values
		int[] numbers = new int[100000];
		for (int i = 0 ; i < numbers.length; i++){
			numbers[i] = ThreadLocalRandom.current().nextInt(-1000000, 1000000 + 1);
		}

		// Step 1 - Brute Force	-> O(n^2)	
		Output.printResults(BruteForce.getMaximum(numbers));		
		
		// Step 2 - Greedy -> O(n)
		Output.printResults(Greedy.getMaximum(numbers));
	}

}
