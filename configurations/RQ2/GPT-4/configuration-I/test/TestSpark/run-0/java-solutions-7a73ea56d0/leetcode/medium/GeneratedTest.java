package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextNewPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
    }

    @Test
    public void nextNewPriceLargerThanPreviousTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(101));
    }

    @Test
    public void nextNewPriceSmallerThanPreviousTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(99));
    }

    @Test
    public void calculateSpansWithAscendingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 101, 102};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansWithDescendingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 99, 98};
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansWithSamePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}