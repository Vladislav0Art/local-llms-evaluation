package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextTest_whenListSizeIsZero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void nextTest_whenListSizeIsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(20);
        assertEquals(2, result);
    }

    @Test
    public void nextTest_whenListSizeIsTwo() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(15);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 15};
        int[] expectedSpans = {1, 2, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}