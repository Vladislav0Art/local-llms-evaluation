package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DuplicatePricesAndDecrease {

    @Test
    public void calculateSpans_DuplicatePricesAndDecrease() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 8, 12};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}