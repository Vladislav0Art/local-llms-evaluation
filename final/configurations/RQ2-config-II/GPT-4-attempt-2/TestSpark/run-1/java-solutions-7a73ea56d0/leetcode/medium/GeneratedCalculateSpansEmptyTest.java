package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansEmptyTest {

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[0];
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[0], result);
    }

}