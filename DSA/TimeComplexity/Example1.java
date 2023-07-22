package com.TimeComplexity;
// Pseudocode : Sum(a, b) { return a + b } 

public class Example1 {

	private static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String args[]) {
		int a=5, b=3;
		System.out.println(Example1.sum(a, b));
		
	}
}
/*
 Time Complexity:  

The above code will take 2 units of time(constant): 
one for arithmetic operations and 
one for return. (as per the above conventions). 
Therefore total cost to perform sum operation (Tsum) = 1 + 1 = 2
Time Complexity = O(2) = O(1), since 2 is constant
Auxiliary Space: O(1)
*/