package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void next_singlePrice() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
    }

    @Test
    public void next_multiplePrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        assertEquals(3, stockSpan.next(40));
    }

    @Test
    public void calculateSpans_emptyPrices() {
        int[] prices = {};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertEquals(0, spans.length);
    }

    @Test
    public void calculateSpans_singlePrice() {
        int[] prices = {10};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, spans);
    }

    @Test
    public void calculateSpans_multiplePrices() {
        int[] prices = {10, 20, 30, 40};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, spans);
    }

}