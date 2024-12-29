package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCalculateSpans_WhenPricesArePositiveAndOneThenReturnsTheCorrectArray {

    @Test
    public void calculateSpans_WhenPricesArePositiveAndOneThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] expectedValues = {1, 2, 3, 4};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

}