package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {10, 5, 5};
        int[] expected = {1, 2, 1};
        // Test 1:
        assertArrayEquals(expected, span.calculateSpans(prices));
    }

}