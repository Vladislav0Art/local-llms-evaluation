package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }

}