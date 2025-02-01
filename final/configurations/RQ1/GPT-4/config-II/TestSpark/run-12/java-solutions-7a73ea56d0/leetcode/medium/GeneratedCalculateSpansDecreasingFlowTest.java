package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingFlowTest {

    @Test
    public void calculateSpansDecreasingFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {30, 20, 10};
        int[] expected = {1, 1, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}