package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTwoDecreasePriceTest {

    @Test
    public void calculateSpansTwoDecreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {150, 100};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1, 1};
        Assert.assertArrayEquals(expected, actual);
    }

}