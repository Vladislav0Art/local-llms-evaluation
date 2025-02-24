package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] prices = {10, 20, 10, 10, 10, 20, 20, 20, 20};
        int[] expected = {1, 1, 2, 1, 2, 1, 4, 5, 6};
        assertArrayEquals(expected, oss.calculateSpans(prices));
    }

}