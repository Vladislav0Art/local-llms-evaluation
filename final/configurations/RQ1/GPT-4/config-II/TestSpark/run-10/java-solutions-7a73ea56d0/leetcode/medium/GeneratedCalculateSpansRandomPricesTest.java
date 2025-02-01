package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCalculateSpansRandomPricesTest {

    @Test
    public void calculateSpansRandomPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 60, 30, 90, 120, 80, 150};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4, 5, 1, 7}, result);
    }

}