package ag.code.ujic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * An array contains numbers.
 * Exactly one number is duplicated in the array.
 * Write java function to find this duplicate
 * <p>
 * Additional questions that would be useful to ask:
 * - does the array contain only positive, negative, or both? (do I really need to know this?)
 * - can the array be modified? (i.e. sort)
 * - can additional Collections be used?
 * <p>
 * Assumptions:
 * - the array contains only integers
 * - the array contains exactly one duplicate number (so I don't need any specific value to return if there's no duplicate)
 */

public class DuplicateFinder {

    // using Set
    public int solveWithSet(int[] array) {

        Set<Integer> duplicates = new HashSet<>();

        // I don't need any special value to be returned in case there's no duplicate number,
        // so I can initialize result with any value, result will be assigned to duplicate number anyway
        int result = 0;

        for (int i : array) {
            if (!duplicates.add(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    // the idea is that x XOR y = 0 iff x = y
    public int solveWithSortAndXor(int[] array) {
        Arrays.sort(array);

        int result = 0;
        for (int i = 1; i < array.length; i++) {
            if ((array[i - 1] ^ array[i]) == 0) {
                result = array[i];
                break;
            }
        }
        return result;
    }

}
