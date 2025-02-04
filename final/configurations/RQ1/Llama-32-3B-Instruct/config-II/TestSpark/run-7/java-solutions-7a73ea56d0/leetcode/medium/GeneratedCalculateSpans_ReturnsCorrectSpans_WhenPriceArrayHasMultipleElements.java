package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_ReturnsCorrectSpans_WhenPriceArrayHasMultipleElements {

    @Test
    public void calculateSpans_ReturnsCorrectSpans_WhenPriceArrayHasMultipleElements() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 8, 2};
        int[] expectedSpans = {1, 2, 3, 4};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}