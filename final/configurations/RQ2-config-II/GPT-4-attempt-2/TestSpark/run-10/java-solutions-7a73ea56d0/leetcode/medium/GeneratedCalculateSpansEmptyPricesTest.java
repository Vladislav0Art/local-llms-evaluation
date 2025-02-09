package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansEmptyPricesTest {

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{}, result);
    }

}