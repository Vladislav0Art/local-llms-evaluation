package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextPriceZeroTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int result = obj.next(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void nextPriceNegativeTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int result = obj.next(-5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void nextPricePositiveTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int result = obj.next(5);
        Assert.assertEquals(1, result);
    }

    @Test
    public void calculateSpansNullPricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = null;
        try {
            obj.calculateSpans(prices);
            Assert.fail("Should have thrown an exception for null prices array.");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Prices cannot be null.", e.getMessage());
        }
    }

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpansMultiplePricesDecreasingTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}