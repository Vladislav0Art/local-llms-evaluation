package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansEmptyPricesArrayTest {

    @Test
    public void calculateSpansEmptyPricesArrayTest() {
        int[] prices = {};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expected = {};
        assertEquals(expected, solution.calculateSpans(prices));
    }

}