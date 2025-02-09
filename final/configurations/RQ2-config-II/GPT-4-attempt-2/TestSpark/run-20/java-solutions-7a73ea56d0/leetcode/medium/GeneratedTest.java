package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        int result = stockSpan.next(90);
        assertEquals(2, result);
    }

    @Test
    public void nextMultiplePricesWithEqualPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(100);
        assertEquals(2, result);
    }

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] comparison = {};
        int[] result = stockSpan.calculateSpans(comparison);
        assertArrayEquals(comparison, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] comparison = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 90, 120, 70, 75, 85, 95};
        int[] comparison = {1, 1, 2, 4, 1, 2, 3, 4};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

    @Test
    public void calculateSpansAllEqualPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        int[] comparison = {1, 2, 3, 4, 5};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 95, 90, 85, 80};
        int[] comparison = {1, 1, 1, 1, 1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 105, 110, 115, 120};
        int[] comparison = {1, 2, 3, 4, 5};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

}