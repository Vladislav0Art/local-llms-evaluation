package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSpans_test_withNoPrices {

    @Test
    public void calculateSpans_test_withNoPrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 0;
        int[][] result = {{0}};
        int expected = 1;
        int actual = stock.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}