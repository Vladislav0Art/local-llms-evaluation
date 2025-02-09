package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextDecreasingValuesTest {

    @Test
    public void nextDecreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(120));
        assertEquals(1, span.next(110));
        assertEquals(1, span.next(100));
    }

}