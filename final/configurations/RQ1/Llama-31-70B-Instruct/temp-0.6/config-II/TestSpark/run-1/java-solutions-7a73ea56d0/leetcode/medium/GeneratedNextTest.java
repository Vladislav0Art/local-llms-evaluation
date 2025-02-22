package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(5));
        assertEquals(2, span.next(3));
        assertEquals(1, span.next(4));
        assertEquals(1, span.next(8));
        assertEquals(1, span.next(1));
        assertEquals(1, span.next(7));
        assertEquals(2, span.next(6));
    }

}