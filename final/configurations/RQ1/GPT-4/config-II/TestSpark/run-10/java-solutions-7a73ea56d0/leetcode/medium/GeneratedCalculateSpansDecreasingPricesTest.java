package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{50, 40, 30, 20, 10};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}