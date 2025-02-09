package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextMixedValuesTest {

    @Test
    public void nextMixedValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(100));
        assertEquals(1, span.next(90));
        assertEquals(2, span.next(120));
        assertEquals(1, span.next(60));
        assertEquals(2, span.next(80));
        assertEquals(1, span.next(70));
        assertEquals(6, span.next(160));
    }

}