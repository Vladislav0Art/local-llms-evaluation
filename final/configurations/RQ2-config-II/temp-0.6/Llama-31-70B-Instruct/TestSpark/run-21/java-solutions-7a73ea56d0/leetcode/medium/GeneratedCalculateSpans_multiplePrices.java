package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_multiplePrices {

    @Test
    public void calculateSpans_multiplePrices() {
        int[] prices = {10, 20, 30, 40};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, spans);
    }

}