package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForDecreasingPrices {

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

}