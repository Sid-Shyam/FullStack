package Revision;

public class MultiDimensionalCopyArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // create a 3d array
		        int[][][] test = {};
		        // for..each loop to iterate through elements of 3d array
		        for (int[][] array2D: test) {
		            for (int[] array1D: array2D) {
		                for(int item: array1D) {
		                    System.out.print(item);
		                }
		                System.out.println();
		            }
		        }
		    }
		
	}


