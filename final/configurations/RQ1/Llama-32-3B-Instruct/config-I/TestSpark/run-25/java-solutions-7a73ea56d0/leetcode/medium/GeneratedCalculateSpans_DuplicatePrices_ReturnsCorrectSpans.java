package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 76, 73, 100};
        int[] expectedSpans = {1, 2, 4, 6, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

}