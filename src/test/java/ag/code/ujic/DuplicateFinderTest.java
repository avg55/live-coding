package ag.code.ujic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicateFinderTest {

    private DuplicateFinder finder = new DuplicateFinder();

    @Test
    void should_return_zero() {
        Integer result = finder.find(new Integer[]{0, 0, 1, 2, 3}).get();
        Assertions.assertEquals(0, result);
    }

    @Test
    void should_return_one() {
        Integer result = finder.find(new Integer[]{0, 1, 2, 3, 1}).get();
        Assertions.assertEquals(1, result);
    }

    @Test
    void should_return_minus_twelve() {
        Integer result = finder.find(new Integer[]{-12, -6, 0, -12, 3, 1}).get();
        Assertions.assertEquals(-12, result);
    }

    @Test
    void should_return_zero_() {
        int result = finder.solveWithSortAndXor(new int[]{0, 0, 1, 2, 3});
        Assertions.assertEquals(0, result);
    }

    @Test
    void should_return_one_() {
        int result = finder.solveWithSortAndXor(new int[]{0, 1, 2, 3, 1});
        Assertions.assertEquals(1, result);
    }

    @Test
    void should_return_minus_twelve_() {
        int result = finder.solveWithSortAndXor(new int[]{-12, -6, 0, -12, 3, 1});
        Assertions.assertEquals(-12, result);
    }

    @Test
    void should_return_five_() {
        int result = finder.solveWithSortAndXor(new int[]{-12, 5, -6, 0, 12, 3, 1, 5});
        Assertions.assertEquals(5, result);
    }

}