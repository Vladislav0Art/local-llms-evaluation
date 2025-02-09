package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextIncreasingValuesTest {

    @Test
    public void nextIncreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(100));
        assertEquals(2, span.next(110));
        assertEquals(3, span.next(120));
    }

}