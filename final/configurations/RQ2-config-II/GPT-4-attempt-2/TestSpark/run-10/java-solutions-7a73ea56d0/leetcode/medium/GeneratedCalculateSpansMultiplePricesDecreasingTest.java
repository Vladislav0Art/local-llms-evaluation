package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesDecreasingTest {

    @Test
    public void calculateSpansMultiplePricesDecreasingTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}