package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_PricesInDescendingOrder_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_PricesInDescendingOrder_ReturnsCorrectSpans() {
        int[] prices = {50, 60, 70, 80, 100};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}