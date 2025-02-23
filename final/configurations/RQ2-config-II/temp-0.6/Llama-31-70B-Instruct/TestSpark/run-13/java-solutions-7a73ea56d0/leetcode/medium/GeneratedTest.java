package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(2));
        Assert.assertEquals(2, stockSpan.next(3));
        Assert.assertEquals(3, stockSpan.next(4));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] expectedSpans = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}