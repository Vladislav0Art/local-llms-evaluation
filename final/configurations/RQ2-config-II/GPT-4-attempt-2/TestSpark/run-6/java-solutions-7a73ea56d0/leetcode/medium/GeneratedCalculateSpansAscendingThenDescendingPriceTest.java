package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAscendingThenDescendingPriceTest {

    @Test
    public void calculateSpansAscendingThenDescendingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 110, 120, 90, 80};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 2, 3, 1, 1};
        Assert.assertArrayEquals(expected, result);
    }

}