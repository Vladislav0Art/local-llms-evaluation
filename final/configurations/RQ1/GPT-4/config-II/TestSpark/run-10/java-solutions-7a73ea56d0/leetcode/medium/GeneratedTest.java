package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void nextFirstCallTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextIncreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        int result = stockSpan.next(20);
        Assert.assertEquals(2, result);
    }

    @Test
    public void nextDecreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(20);
        int result = stockSpan.next(10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextSamePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        int result = stockSpan.next(10);
        Assert.assertEquals(2, result);
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 20, 30, 40, 50};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{50, 40, 30, 20, 10};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

    @Test
    public void calculateSpansSamePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 10, 10, 10, 10};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpansRandomPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 60, 30, 90, 120, 80, 150};
        int[] result = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4, 5, 1, 7}, result);
    }

}