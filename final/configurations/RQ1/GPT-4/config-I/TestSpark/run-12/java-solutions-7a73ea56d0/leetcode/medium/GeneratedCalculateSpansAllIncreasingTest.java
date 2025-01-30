package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllIncreasingTest {

    @Test
    public void calculateSpansAllIncreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 110, 120};
        int[] expected = {1, 1, 1};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}