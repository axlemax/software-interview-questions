
Finding the Maximum Difference
------------------------------

Given a set of numbers, find the maximum difference between two numbers where order matters (i.e. one must come _before_ the other).
Examples are finding the highest temperature increase, or looking for the most profit on stock prices.

### Important Thoughts
  * **The highest number will not necessarily be included.**
     * Example: [12, 5, 7, 8, 11, 9]   --> maximum difference is between **5** and **11** (not 12 and 5)
  * **The lowest number will not necessarily be included.**
     * Example: [12, 5, 7, 8, 11, 4]   --> maximum difference is between **5** and **11** (not 12 and 4)

### Some Edge Cases
   * What if the values _stay the same_?
   * What if the value _only decreases_?

---
### Step 1 - Brute Force

The easiest way to find the maximum difference is to compare _every number_ to _every other numer_.
To improve on that somewhat, we can make sure only to check each number with the numbers that come afterwards.

The runtime for this is:  
      n + (n - 1) + (n - 2) + (n -3) + ... + (n - (n - 1) ) + (n - n)  
Which simplifies to:  
      O(n^2)
      
Code:
````java
for (int currentValue = 0; currentValue < numbers.length; currentValue++){
  for (int compareValue = numbers.length - 1; compareValue >  currentValue; compareValue--){
				
	// Compare to maximum found so far, update if larger
	if ((numbers[compareValue] - numbers[currentValue]) > maximum)
		maximum = numbers[compareValue] - numbers[currentValue];
  }
}
````
### Step 2 - Iterative and Greedy

How about we use a greedy algorithm and try to find the maxmimum difference as we go? That sounds good, but how do we know _which value_ to compare each number to in order to get its difference? We should keep track of the _lowest number seen so far_ and compare it to every other number after that point.

The runtime for this is:  
      O(n)   
      Since we are only traversing the array one time, looking at each number once.
      
Here is the code:
````java
int lowestSoFar = numbers[0];
for (int i = 1; i < numbers.length; i++){
			
	// Update maximum difference when needed
	if ((numbers[i] - lowestSoFar) > maximum)
		maximum = numbers[i] - lowestSoFar;
			
	// Update lowest value seen so far
	if (numbers[i] < lowestSoFar)
		lowestSoFar = numbers[i];
}		
````

### Conclusion
Since we must check every number to find the maximum difference, the best possible algorithm is O(n), which we have done. Success!
