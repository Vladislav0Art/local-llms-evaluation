package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int result = oss.next(100);
        assertEquals(1, result);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        oss.next(100);
        int result = oss.next(80);
        assertEquals(1, result);
    }

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        oss.next(100);
        oss.next(120);
        int result = oss.next(130);
        assertEquals(3, result);
    }

    @Test
    public void nextDecreasingPricesTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        oss.next(130);
        oss.next(120);
        int result = oss.next(100);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, spans);
    }

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, spans);
    }

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{100, 80, 120, 130});
        assertArrayEquals(new int[]{1, 1, 2, 3}, spans);
    }

    @Test
    public void calculateSpansDecreasingOrderArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{130, 120, 100});
        assertArrayEquals(new int[]{1, 1, 1}, spans);
    }

    @Test
    public void calculateSpansIncreasingOrderArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{100, 120, 130});
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

}