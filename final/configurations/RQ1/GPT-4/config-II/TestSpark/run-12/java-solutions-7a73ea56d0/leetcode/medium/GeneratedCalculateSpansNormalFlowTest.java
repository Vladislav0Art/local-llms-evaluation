package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansNormalFlowTest {

    @Test
    public void calculateSpansNormalFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 90, 15, 68, 60};
        int[] expected = {1, 2, 1, 4, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}