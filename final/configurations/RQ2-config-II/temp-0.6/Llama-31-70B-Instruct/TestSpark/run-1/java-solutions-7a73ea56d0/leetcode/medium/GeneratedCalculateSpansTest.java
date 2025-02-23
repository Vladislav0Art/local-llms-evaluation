package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 5, 15, 5};
        int[] expected = {1, 2, 1, 2, 4};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}