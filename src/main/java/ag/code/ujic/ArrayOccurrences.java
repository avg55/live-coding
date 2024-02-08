package ag.code.ujic;

import java.util.Arrays;

/**
 * Find number of occurrences in array
 * <p>
 * Write java function to find number of occurrences of some number in given array of numbers
 */
public class ArrayOccurrences {

    public int findWithStream(int[] array, int numberToFind) {
        return (int) Arrays.stream(array)
                .filter(elem -> elem == numberToFind)
                .count();
    }

}
