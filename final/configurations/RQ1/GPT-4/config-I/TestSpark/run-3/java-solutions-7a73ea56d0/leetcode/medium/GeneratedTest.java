package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextOnePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int actual = stockSpan.next(100);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void nextTwoIncreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int actual = stockSpan.next(150);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void nextTwoDecreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(150);
        int actual = stockSpan.next(100);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(95);
        stockSpan.next(120);
        stockSpan.next(110);
        int actual = stockSpan.next(121);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansTwoIncreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 150};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1, 2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansTwoDecreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {150, 100};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1, 1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 95, 120, 110, 121};
        int[] actual = stockSpan.calculateSpans(prices);
        int[] expected = {1, 1, 3, 1, 3};
        Assert.assertArrayEquals(expected, actual);
    }

}