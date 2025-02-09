package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, result);
    }

}