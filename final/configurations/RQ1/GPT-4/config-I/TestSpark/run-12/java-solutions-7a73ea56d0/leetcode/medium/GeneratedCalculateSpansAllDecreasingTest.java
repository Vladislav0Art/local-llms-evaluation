package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllDecreasingTest {

    @Test
    public void calculateSpansAllDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {120, 110, 100};
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}