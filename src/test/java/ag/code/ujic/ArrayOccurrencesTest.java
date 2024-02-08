package ag.code.ujic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayOccurrencesTest {

    ArrayOccurrences finder = new ArrayOccurrences();

    @Test
    void should_return_0() {
        Assertions.assertEquals(0,
                finder.findWithStream(new int[]{1, 2, 3, 4, 5}, 6));
    }

    @Test
    void should_return_4() {
        Assertions.assertEquals(4,
                finder.findWithStream(new int[]{1, 2, 1, 1, 1, 3, 4, 5}, 1));
    }
}