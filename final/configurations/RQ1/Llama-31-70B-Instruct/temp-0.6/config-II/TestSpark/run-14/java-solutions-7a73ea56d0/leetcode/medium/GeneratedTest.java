package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(11));
        assertEquals(2, stockSpan.next(12));
        assertEquals(3, stockSpan.next(13));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] expectedSpans = new int[]{1, 2, 3, 4, 5};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}