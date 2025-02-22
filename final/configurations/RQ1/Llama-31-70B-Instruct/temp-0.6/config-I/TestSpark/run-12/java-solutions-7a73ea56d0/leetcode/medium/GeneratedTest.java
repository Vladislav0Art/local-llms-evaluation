package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(1));
        assertEquals(1, onlineStockSpan.next(2));
        assertEquals(1, onlineStockSpan.next(3));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expectedSpans = {1, 1, 1};
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}