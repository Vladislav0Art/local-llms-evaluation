package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        int[] prices = {10};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expected = {1};
        assertEquals(expected, solution.calculateSpans(prices));
    }

}