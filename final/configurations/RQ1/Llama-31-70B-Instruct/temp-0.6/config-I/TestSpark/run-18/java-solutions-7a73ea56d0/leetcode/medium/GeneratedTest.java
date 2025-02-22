package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(5));
        assertEquals(2, stockSpan.next(6));
        assertEquals(3, stockSpan.next(3));
        assertEquals(4, stockSpan.next(1));
        assertEquals(5, stockSpan.next(9));
        assertEquals(6, stockSpan.next(8));
        assertEquals(7, stockSpan.next(2));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 15, 10, 20, 8};
        int[] expectedSpans = {1, 1, 2, 1, 4, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);
        for (int i = 0; i < expectedSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}