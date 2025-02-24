package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextIsIncreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(15));
        assertEquals(3, stockSpan.next(20));
    }

    @Test
    public void nextIsDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(20));
        assertEquals(1, stockSpan.next(15));
        assertEquals(1, stockSpan.next(10));
    }

    @Test
    public void nextIsMixedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(15));
        assertEquals(2, stockSpan.next(14));
        assertEquals(1, stockSpan.next(13));
        assertEquals(1, stockSpan.next(12));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 15, 20, 15, 10};
        int[] expected = {1, 2, 3, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}