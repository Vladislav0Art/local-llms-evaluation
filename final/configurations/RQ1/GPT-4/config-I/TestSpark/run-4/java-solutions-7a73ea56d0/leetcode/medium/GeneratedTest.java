package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextEmptyListTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextNonEmptyListTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(80);
        Assert.assertEquals(1, result);
    }

    @Test
    public void nextNonEmptyListGreaterPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(120);
        Assert.assertEquals(2, result);
    }

    @Test
    public void nextMultiplePurchasesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(60);
        int result = onlineStockSpan.next(120);
        Assert.assertEquals(4, result);
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 120};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 4}, result);
    }

    @Test
    public void calculateSpansDescendingElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {120, 100, 80, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

    @Test
    public void calculateSpansAscendingElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {60, 80, 100, 120};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}