package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansLowerThenHigherPriceTest {

    @Test
    public void calculateSpansLowerThenHigherPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 80, 120};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 1, 3};
        Assert.assertArrayEquals(expected, result);
    }

}