package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(10);
        stock.next(20);
        stock.next(30);
        Assert.assertEquals(3, stock.next(40));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, stock.calculateSpans(prices));
    }

}