package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}