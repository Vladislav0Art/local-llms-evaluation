package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(5));
        assertEquals(1, onlineStockSpan.next(12));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 3, 8, 2, 9};
        int[] expectedSpans = {1, 1, 1, 3, 1, 4};
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}