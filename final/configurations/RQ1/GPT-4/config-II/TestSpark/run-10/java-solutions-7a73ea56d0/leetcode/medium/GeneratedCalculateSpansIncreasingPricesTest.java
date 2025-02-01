package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCalculateSpansIncreasingPricesTest {

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 20, 30, 40, 50};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}