package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void next() {
        OnlineStockSpan obj = new OnlineStockSpan();
        assertEquals(1, obj.next(1));
        assertEquals(1, obj.next(2));
        assertEquals(1, obj.next(3));
        assertEquals(1, obj.next(4));
        assertEquals(1, obj.next(5));
    }

    @Test
    public void calculateSpans() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, obj.calculateSpans(prices));
    }

}