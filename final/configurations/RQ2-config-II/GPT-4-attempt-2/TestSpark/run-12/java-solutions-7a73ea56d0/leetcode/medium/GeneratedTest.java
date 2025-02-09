package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextPriceIsGreaterThanAllPreviousPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(110));
        assertEquals(3, onlineStockSpan.next(120));
    }

    @Test
    public void nextPriceIsLowerThanLastPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(1, onlineStockSpan.next(90));
    }

    @Test
    public void nextPriceIsEqualWithLastPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(100));
    }

    @Test
    public void calculateSpansWithAscendingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 110, 120, 130, 140};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

    @Test
    public void calculateSpansWithDescendingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {140, 130, 120, 110, 100};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, spans);
    }

    @Test
    public void calculateSpansWithSamePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

}