package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCalculateSpans_WhenPricesAreNegativeAndMultipleThenReturnsTheCorrectArray {

    @Test
    public void calculateSpans_WhenPricesAreNegativeAndMultipleThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-1, -2, -3};
        int[] expectedValues = {0, 0, 0};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

}