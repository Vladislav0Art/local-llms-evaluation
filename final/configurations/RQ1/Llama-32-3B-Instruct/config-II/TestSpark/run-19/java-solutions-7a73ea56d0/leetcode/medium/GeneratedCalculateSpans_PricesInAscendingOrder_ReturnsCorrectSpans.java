package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_PricesInAscendingOrder_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_PricesInAscendingOrder_ReturnsCorrectSpans() {
        int[] prices = {100, 80, 70, 60, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}