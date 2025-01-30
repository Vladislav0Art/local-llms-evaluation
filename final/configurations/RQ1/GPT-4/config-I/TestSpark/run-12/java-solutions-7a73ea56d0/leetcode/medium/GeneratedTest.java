package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextPriceIncreasesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(100));
        Assert.assertEquals(1, stockSpan.next(110));
        Assert.assertEquals(1, stockSpan.next(120));
    }

    @Test
    public void nextPriceDecreasesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(100));
        Assert.assertEquals(2, stockSpan.next(90));
        Assert.assertEquals(3, stockSpan.next(80));
    }

    @Test
    public void nextPriceSameTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(100));
        Assert.assertEquals(2, stockSpan.next(100));
        Assert.assertEquals(3, stockSpan.next(100));
    }

    @Test
    public void calculateSpansAllIncreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 110, 120};
        int[] expected = {1, 1, 1};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansAllDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {120, 110, 100};
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMixedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 120, 110, 130, 120};
        int[] expected = {1, 2, 1, 4, 1};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] expected = {1};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}