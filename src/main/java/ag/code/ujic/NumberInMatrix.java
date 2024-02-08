package ag.code.ujic;

/**
 * Find number in matrix
 * <p>
 * In a 2D matrix, every row ins increasingly sorted from left to right.
 * Last number in each row is not greater than first number in next row.
 * Write java function to check if there is a number in the matrix
 * <p>
 * Assumptions: matrix is of size m*n (all rows have the same length)
 */

public class NumberInMatrix {

    public boolean contains(int[][] matrix, int numberToCheck) {
        for (int[] currentRow : matrix) {
            if (currentRow[0] <= numberToCheck
                    && currentRow[currentRow.length - 1] >= numberToCheck) {
                for (int i : currentRow) {
                    if (i == numberToCheck) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
