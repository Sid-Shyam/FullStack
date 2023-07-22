package com.TimeComplexity;
public class Example3 {
    private static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void main(String[] args) {
       
        int[][] matrix = {
            { 5, 8, 9, 4, 5 },
            { 7, 4, 6, 2, 9 },
            { 6, 2, 1, 8, 5 },
            { 2, 3, 9, 4, 7 }
        };
        long startTime1= System.currentTimeMillis();
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        long endTime1= System.currentTimeMillis();
        System.out.println("Exceution time 1:     "+(endTime1-startTime1));
        // Transposing the given matrix
        long startTime2= System.currentTimeMillis();
        int[][] transposedMat = transposeMatrix(matrix);
        long endTime2= System.currentTimeMillis();
        System.out.println("Exceution time 2:      "+(endTime2-startTime2));
        System.out.println("Transposed Matrix:");
        long startTime3= System.currentTimeMillis();
        displayMatrix(transposedMat);
        long endTime3= System.currentTimeMillis();
        System.out.println("Exceution time 3:       "+(endTime3-startTime3));
        long finalEndTime=endTime1+endTime2+endTime3;
        long finalStartTime=startTime1+startTime2+startTime3;
        System.out.println("Exceution time :"+(finalEndTime-finalStartTime));
    }
}
