package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextPositiveTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(1));
        Assert.assertEquals(1, stockSpan.next(2));
        Assert.assertEquals(2, stockSpan.next(3));
    }

    @Test
    public void nextNegativeTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(2, stockSpan.next(3));
        Assert.assertEquals(1, stockSpan.next(2));
        Assert.assertEquals(1, stockSpan.next(1));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}