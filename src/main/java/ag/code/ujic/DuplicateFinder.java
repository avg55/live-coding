package ag.code.ujic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * An array contains numbers.
 * Exactly one number is duplicated in the array.
 * Write java function to find this duplicate
 * <p>
 * Additional: try to write generic method
 * <p>
 * Additional questions that would be useful to ask:
 * - can the array be modified? (i.e. sort)
 * - can additional Collections be used?
 * <p>
 */

public class DuplicateFinder {

    // using Set
    public <T> Optional<T> find(T[] array) {

        Set<T> uniqueElements = new HashSet<>();

        for (T element : array) {
            if (!uniqueElements.add(element)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
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
