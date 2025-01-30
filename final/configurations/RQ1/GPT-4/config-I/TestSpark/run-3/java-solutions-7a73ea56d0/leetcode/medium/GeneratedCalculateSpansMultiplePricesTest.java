package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 95, 120, 110, 121};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1, 1, 3, 1, 3};
        Assert.assertArrayEquals(expected, actual);
    }

}