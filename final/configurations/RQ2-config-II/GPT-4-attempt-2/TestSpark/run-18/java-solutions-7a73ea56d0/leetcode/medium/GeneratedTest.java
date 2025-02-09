package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextFirstPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextLessThanPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(80);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextGreaterThanPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(120);
        Assert.assertEquals(2, result);
    }

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{});
        Assert.assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100});
        Assert.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansMultipleIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100, 110, 120, 130});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void calculateSpansMultipleDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{130, 120, 110, 100});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100, 110, 90, 120, 80});
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4, 1}, result);
    }

}