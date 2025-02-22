package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(1, stockSpan.next(2));
        assertEquals(2, stockSpan.next(3));
        assertEquals(3, stockSpan.next(4));
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}