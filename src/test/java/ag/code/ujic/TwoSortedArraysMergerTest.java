package ag.code.ujic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSortedArraysMergerTest {

    @Test
    void test1() {
        int[] expected = {-10, 0, 15, 45};
        int[] actual = TwoSortedArraysMerger.mergeTwoSortedArrays(
                new int[]{-10, 15},
                new int[]{0, 45});
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] expected = {-10, 0, 0, 1, 3, 7};
        int[] actual = TwoSortedArraysMerger.mergeTwoSortedArrays(
                new int[]{0},
                new int[]{-10, 0, 1, 3, 7});
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] expected = {-10, 0, 1, 3, 7};
        int[] actual = TwoSortedArraysMerger.mergeTwoSortedArrays(
                new int[]{},
                new int[]{-10, 0, 1, 3, 7});
        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        int[] expected = {};
        int[] actual = TwoSortedArraysMerger.mergeTwoSortedArrays(
                new int[]{},
                new int[]{});
        assertArrayEquals(expected, actual);
    }

}