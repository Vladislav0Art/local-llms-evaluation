package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void next_ReturnsCorrectCountForIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        assertEquals(1L, onlineStockSpan.list[0]);
    }

    @Test
    public void next_ReturnsCorrectCountForDecreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 8, 11, 9, 7};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        assertEquals(6L, onlineStockSpan.list[0]);
    }

    @Test
    public void next_ReturnsCorrectCountForSamePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        assertEquals(3L, onlineStockSpan.list[0]);
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpansForIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] expectedSpans = {1L, 2L, 3L, 4L, 5L, 6L};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < actualSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpansForDecreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 8, 11, 9, 7};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] expectedSpans = {1L, 6L, 3L, 4L, 5L, 2L};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < actualSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpansForSamePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int[] expectedSpans = {1L, 2L, 3L};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < actualSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}