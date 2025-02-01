package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCalculateSpansSamePricesTest {

    @Test
    public void calculateSpansSamePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 10, 10, 10, 10};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}