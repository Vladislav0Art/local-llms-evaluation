package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        assertEquals(1, obj.next(10));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, obj.calculateSpans(prices));
    }

}