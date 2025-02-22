package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(20));
        assertEquals(1, onlineStockSpan.next(5));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}