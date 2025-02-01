package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(5));
        assertEquals(1, span.next(3));
        assertEquals(2, span.next(5));
        assertEquals(1, span.next(1));
        assertEquals(5, span.next(5));
    }

}