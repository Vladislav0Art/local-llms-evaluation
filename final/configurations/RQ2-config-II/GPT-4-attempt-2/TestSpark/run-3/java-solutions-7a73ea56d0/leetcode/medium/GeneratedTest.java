package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void nextPriceHigherThanAllPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(100));
        Assert.assertEquals(1, onlineStockSpan.next(90));
        Assert.assertEquals(1, onlineStockSpan.next(80));
        Assert.assertEquals(4, onlineStockSpan.next(101));
    }

    @Test
    public void nextPriceLowerThanAllPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(101));
        Assert.assertEquals(2, onlineStockSpan.next(102));
        Assert.assertEquals(3, onlineStockSpan.next(103));
        Assert.assertEquals(1, onlineStockSpan.next(90));
    }

    @Test
    public void nextPriceInBetweenPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(101));
        Assert.assertEquals(2, onlineStockSpan.next(102));
        Assert.assertEquals(3, onlineStockSpan.next(103));
        Assert.assertEquals(4, onlineStockSpan.next(104));
        Assert.assertEquals(2, onlineStockSpan.next(103));
    }

    @Test
    public void calculateSpansAllPricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    public void calculateSpansAllPricesDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, onlineStockSpan.calculateSpans(new int[]{50, 40, 30, 20, 10}));
    }

    @Test
    public void calculateSpansMixedPropsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 1}, onlineStockSpan.calculateSpans(new int[]{30, 20, 30, 40, 10}));
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(new int[]{}));
    }

}