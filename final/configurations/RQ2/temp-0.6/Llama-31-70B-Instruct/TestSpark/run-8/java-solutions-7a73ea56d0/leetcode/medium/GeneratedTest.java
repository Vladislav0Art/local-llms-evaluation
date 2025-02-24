package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(1, stockSpan.next(2));
        assertEquals(1, stockSpan.next(3));
        assertEquals(2, stockSpan.next(1));
        assertEquals(1, stockSpan.next(1));
        assertEquals(2, stockSpan.next(2));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 1, 1, 2};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        int[] expectedSpans = {1, 1, 1, 2, 1, 2};
        assertArrayEquals(expectedSpans, actualSpans);
    }

}