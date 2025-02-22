package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private OnlineStockSpan stockSpan;

    @Test
    public void nextTest() {
        stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(2, stockSpan.next(2));
        assertEquals(1, stockSpan.next(3));
        assertEquals(1, stockSpan.next(2));
        assertEquals(1, stockSpan.next(1));
    }

    @Test
    public void calculateSpansTest() {
        stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 2, 1};
        int[] expected = {1, 2, 3, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}