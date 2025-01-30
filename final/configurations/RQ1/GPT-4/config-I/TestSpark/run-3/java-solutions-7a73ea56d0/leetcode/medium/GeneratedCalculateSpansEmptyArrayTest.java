package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {};
        Assert.assertArrayEquals(expected, actual);
    }

}