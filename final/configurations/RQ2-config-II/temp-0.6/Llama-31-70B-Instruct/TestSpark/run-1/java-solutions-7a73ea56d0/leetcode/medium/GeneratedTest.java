package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(20));
        assertEquals(1, stockSpan.next(5));
        assertEquals(2, stockSpan.next(15));
        assertEquals(4, stockSpan.next(5));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 5, 15, 5};
        int[] expected = {1, 2, 1, 2, 4};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}