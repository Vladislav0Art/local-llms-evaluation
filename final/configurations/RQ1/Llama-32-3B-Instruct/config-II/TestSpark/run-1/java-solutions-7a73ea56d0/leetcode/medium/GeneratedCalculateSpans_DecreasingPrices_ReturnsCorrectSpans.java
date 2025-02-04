package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_DecreasingPrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DecreasingPrices_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {40, 30, 20, 10};
        int[] expected = {4, 3, 2, 1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}