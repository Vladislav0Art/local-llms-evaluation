package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1}, result);
    }

}