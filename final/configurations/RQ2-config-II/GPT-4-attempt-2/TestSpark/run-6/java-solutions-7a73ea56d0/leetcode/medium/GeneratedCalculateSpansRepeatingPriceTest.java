package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansRepeatingPriceTest {

    @Test
    public void calculateSpansRepeatingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 100, 100};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

}