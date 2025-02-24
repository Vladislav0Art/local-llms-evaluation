package leetcode.medium;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        Assert.assertEquals(span.next(10), 1);
        Assert.assertEquals(span.next(5), 1);
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        OnlineStockSpan span = new OnlineStockSpan();
        Assert.assertArrayEquals(expected, span.calculateSpans(prices));
    }

}