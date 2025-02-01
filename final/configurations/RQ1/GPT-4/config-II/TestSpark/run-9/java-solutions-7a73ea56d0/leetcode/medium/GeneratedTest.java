package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextSingleInputTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int count = onlineStockSpan.next(100);
        Assert.assertEquals(1, count);
    }

    @Test
    public void nextMultipleInputTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int count = onlineStockSpan.next(80);
        Assert.assertEquals(1, count);
    }

    @Test
    public void nextMultipleInputIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int count = onlineStockSpan.next(120);
        Assert.assertEquals(2, count);
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100});
        Assert.assertArrayEquals(new int[]{1}, spans);
    }

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, spans);
    }

    @Test
    public void calculateSpansAllElementsIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

    @Test
    public void calculateSpansAllElementsDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{50, 40, 30, 20, 10});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, spans);
    }

}