package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextNewPriceLargerThanLastTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(1, stockSpan.next(15));
    }

    @Test
    public void nextNewPriceSmallerThanLastTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(20);
        assertEquals(2, stockSpan.next(10));
    }

    @Test
    public void nextAllPricesEqualTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(30);
        stockSpan.next(30);
        assertEquals(3, stockSpan.next(30));
    }

    @Test
    public void calculateSpansAllPricesAscendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansAllPricesDescendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expectedSpans = {1, 1, 1, 1, 1};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansAllPricesSameTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {30, 30, 30, 30, 30};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansRandomPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}