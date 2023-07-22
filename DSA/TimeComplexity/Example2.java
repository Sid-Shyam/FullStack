// Java code for the above approach
package com.TimeComplexity;

import java.util.Arrays;

class Example2 {

	static int list_Sum(int[] A, int n)

	// A->array and
	// n->number of elements in array
	{
		int sum = 0;
		for (int i = 0; i <= n - 1; i++) {
			sum = sum + A[i];
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int[] A = { 5, 6, 1, 2 };
		int n = A.length;
		//Measure the start time
		long startTime= System.currentTimeMillis();
		System.out.println(list_Sum(A, n));
		//Measure the End time 
		long endTime= System.currentTimeMillis();
		System.out.println("Array: " + Arrays.toString(A));
		System.out.println("Exceution time :"+(endTime-startTime));
	}
}
/*
To understand the time complexity of the above code, let’s see how much time each statement will take:

Pseudocode : list_Sum(A, n)
{
total =0                   // cost=1  no of times=1
for i=0 to n-1             // cost=2  no of times=n+1 (+1 for the end false condition)
    sum = sum + A[i]       // cost=2  no of times=n
return sum                 // cost=1  no of times=1
}
Therefore the total cost to perform sum operation 

Tsum=1 + 2 * (n+1) + 2 * n + 1 = 4n + 4 =C1 * n + C2 = O(n)

Therefore, the time complexity of the above code is O(n)
*/