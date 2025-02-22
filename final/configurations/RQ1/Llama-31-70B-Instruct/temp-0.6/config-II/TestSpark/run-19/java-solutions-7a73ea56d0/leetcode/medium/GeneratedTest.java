package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan span = new OnlineStockSpan();
        // Test 1:
        assertEquals(1, span.next(10));
        // Test 2:
        assertEquals(2, span.next(5));
        // Test 3:
        assertEquals(1, span.next(5));
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {10, 5, 5};
        int[] expected = {1, 2, 1};
        // Test 1:
        assertArrayEquals(expected, span.calculateSpans(prices));
    }

}