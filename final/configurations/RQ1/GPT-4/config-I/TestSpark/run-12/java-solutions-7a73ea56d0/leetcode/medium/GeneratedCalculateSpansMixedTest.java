package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMixedTest {

    @Test
    public void calculateSpansMixedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 120, 110, 130, 120};
        int[] expected = {1, 2, 1, 4, 1};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}