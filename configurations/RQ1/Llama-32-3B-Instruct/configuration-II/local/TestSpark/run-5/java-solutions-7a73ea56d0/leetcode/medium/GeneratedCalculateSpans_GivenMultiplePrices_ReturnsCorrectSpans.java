package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_GivenMultiplePrices_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_GivenMultiplePrices_ReturnsCorrectSpans() {
        int[] prices = {100, 80, 75, 70, 60, 70};
        int[] expectedResult = {1, 1, 2, 3, 4, 5};
        int[] actualResult = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedResult, actualResult);
    }

}