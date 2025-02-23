package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(11));
        assertEquals(2, stockSpan.next(9));
        assertEquals(1, stockSpan.next(10));
    }

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 11, 9, 10};
        int[] expectedSpans = {1, 2, 1, 1};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}