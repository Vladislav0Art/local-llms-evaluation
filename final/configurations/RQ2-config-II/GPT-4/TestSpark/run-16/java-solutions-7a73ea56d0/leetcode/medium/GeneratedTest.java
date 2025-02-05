package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextNewPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int response = onlineStockSpan.next(100);
        Assert.assertEquals(1, response);
    }

    @Test
    public void nextExistingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int response = onlineStockSpan.next(100);
        Assert.assertEquals(2, response);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(60);
        onlineStockSpan.next(70);
        onlineStockSpan.next(60);
        onlineStockSpan.next(75);
        onlineStockSpan.next(85);
        int response = onlineStockSpan.next(120);
        Assert.assertEquals(8, response);
    }

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] response = onlineStockSpan.calculateSpans(new int[]{});
        Assert.assertArrayEquals(new int[]{}, response);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] response = onlineStockSpan.calculateSpans(new int[]{100});
        Assert.assertArrayEquals(new int[]{1}, response);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] response = onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, response);
    }

}