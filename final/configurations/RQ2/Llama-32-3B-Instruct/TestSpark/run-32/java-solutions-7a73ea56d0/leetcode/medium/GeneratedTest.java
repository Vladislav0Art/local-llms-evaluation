package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextPriceZeroTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(0));
    }

    @Test
    public void nextPricePositiveTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(2, solution.next(5));
    }

    @Test
    public void nextPriceNegativeTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(-3));
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        int[] prices = {10};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expected = {1};
        assertEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        int[] prices = {-2, -3, 4, 0, 5};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expected = {1, 1, 2, 2, 3};
        assertEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpansEmptyPricesArrayTest() {
        int[] prices = {};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expected = {};
        assertEquals(expected, solution.calculateSpans(prices));
    }

}