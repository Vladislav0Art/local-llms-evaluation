package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(5));
        assertEquals(2, stockSpan.next(10));
        assertEquals(3, stockSpan.next(15));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 10, 15};
        int[] expected = {1, 2, 3, 4};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}