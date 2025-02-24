package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        assertEquals(0, oss.next(10));
        assertEquals(1, oss.next(20));
        assertEquals(2, oss.next(10));
        assertEquals(1, oss.next(10));
        assertEquals(2, oss.next(10));
        assertEquals(3, oss.next(20));
        assertEquals(1, oss.next(20));
        assertEquals(4, oss.next(20));
        assertEquals(5, oss.next(20));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] prices = {10, 20, 10, 10, 10, 20, 20, 20, 20};
        int[] expected = {1, 1, 2, 1, 2, 1, 4, 5, 6};
        assertArrayEquals(expected, oss.calculateSpans(prices));
    }

}