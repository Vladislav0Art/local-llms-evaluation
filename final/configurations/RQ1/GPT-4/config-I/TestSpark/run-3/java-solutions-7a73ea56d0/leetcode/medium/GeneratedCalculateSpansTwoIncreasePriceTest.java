package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTwoIncreasePriceTest {

    @Test
    public void calculateSpansTwoIncreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 150};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1, 2};
        Assert.assertArrayEquals(expected, actual);
    }

}