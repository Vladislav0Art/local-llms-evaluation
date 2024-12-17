package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSpans_test_withEmptyPrices {

    @Test
    public void calculateSpans_test_withEmptyPrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {};
        int[][] result = {{0, 1}, {2, 3}};
        int expected = 5;
        int actual = stock.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}