package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansPricesAreInDecreasingOrderTest {

    @Test
    public void calculateSpansPricesAreInDecreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {5, 4, 3, 2, 1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        int[] expected = {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expected, actual);
    }

}