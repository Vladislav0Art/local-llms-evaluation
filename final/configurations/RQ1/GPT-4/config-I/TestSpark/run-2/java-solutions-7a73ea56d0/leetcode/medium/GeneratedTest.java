package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextPriceLessThanCurrentTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(80));
    }

    @Test
    public void nextPriceEqualToCurrentTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(100));
    }

    @Test
    public void nextPriceGreaterThanCurrentTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(120));
    }

    @Test
    public void nextInitialPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] expectedSpans = {1, 1, 2, 4, 5, 1};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expectedSpans = {1};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansAllElementsEqualTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10, 10};
        int[] expectedSpans = {1, 2, 3, 4};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}