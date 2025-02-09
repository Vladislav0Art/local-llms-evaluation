package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextInitialPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int result = span.next(100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextLowerPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(80);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextHigherPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(120);
        Assert.assertEquals(2, result);
    }

    @Test
    public void nextSiblingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(100);
        Assert.assertEquals(2, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansLowerThenHigherPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 80, 120};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 1, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansRepeatingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 100, 100};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansDescendingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 90, 80};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 1, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansAscendingThenDescendingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 110, 120, 90, 80};
        int[] result = span.calculateSpans(prices);
        int[] expected = {1, 2, 3, 1, 1};
        Assert.assertArrayEquals(expected, result);
    }

}