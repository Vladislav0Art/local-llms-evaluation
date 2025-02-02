package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForIncreasingPrices {

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

}