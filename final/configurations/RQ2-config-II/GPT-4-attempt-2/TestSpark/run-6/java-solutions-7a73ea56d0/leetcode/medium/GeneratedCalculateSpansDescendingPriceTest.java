package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansDescendingPriceTest {

    @Test
    public void calculateSpansDescendingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 90, 80};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 1, 1};
        Assert.assertArrayEquals(expected, result);
    }

}