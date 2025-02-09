package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        int[] prices = {-2, -3, 4, 0, 5};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expected = {1, 1, 2, 2, 3};
        assertEquals(expected, solution.calculateSpans(prices));
    }

}