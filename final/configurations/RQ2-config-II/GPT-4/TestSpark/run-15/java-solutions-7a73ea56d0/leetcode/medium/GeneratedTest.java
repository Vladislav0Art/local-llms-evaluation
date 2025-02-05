package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int actual = stockSpan.next(100);
        assertEquals(1, actual);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int actual = stockSpan.next(80);
        assertEquals(1, actual);
    }

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(200);
        int actual = stockSpan.next(300);
        assertEquals(3, actual);
    }

    @Test
    public void nextDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(300);
        stockSpan.next(200);
        int actual = stockSpan.next(100);
        assertEquals(1, actual);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{100}));
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1, 2, 3, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{100, 200, 300, 50}));
    }

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{300, 200, 100}));
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{100, 200, 300}));
    }

}