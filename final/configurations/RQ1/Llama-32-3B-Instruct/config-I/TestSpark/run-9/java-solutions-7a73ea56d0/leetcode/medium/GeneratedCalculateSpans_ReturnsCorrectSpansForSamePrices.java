package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForSamePrices {

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