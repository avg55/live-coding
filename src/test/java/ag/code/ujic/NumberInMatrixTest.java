package ag.code.ujic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberInMatrixTest {

    NumberInMatrix testedObject = new NumberInMatrix();

    @Test
    void should_return_true() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5}
        };
        Assertions.assertTrue(testedObject.contains(matrix, 1));
    }

    @Test
    void should_return_true2() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5}
        };
        Assertions.assertTrue(testedObject.contains(matrix, 3));
    }

    @Test
    void should_return_true3() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5}
        };
        Assertions.assertTrue(testedObject.contains(matrix, 4));
    }

    @Test
    void should_return_false() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5}
        };
        Assertions.assertFalse(testedObject.contains(matrix, 6));
    }

}