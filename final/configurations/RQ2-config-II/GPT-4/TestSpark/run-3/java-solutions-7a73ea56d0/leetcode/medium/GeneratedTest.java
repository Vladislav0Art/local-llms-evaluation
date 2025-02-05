package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextUniquePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
    }

    @Test
    public void nextDuplicatePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(100));
    }

    @Test
    public void nextLesserPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(50));
    }

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansIncrementalTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansDecrementalTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expected = {1, 1, 1, 1, 1};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMixedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 20, 10, 30};
        int[] expected = {1, 2, 3, 1, 5};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}