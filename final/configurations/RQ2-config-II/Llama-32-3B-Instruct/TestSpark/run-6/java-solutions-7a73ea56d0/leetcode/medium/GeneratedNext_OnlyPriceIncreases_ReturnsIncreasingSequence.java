package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_OnlyPriceIncreases_ReturnsIncreasingSequence {

    @Test
    public void next_OnlyPriceIncreases_ReturnsIncreasingSequence() {
        int[] prices = {10, 9, 8, 7, 6};
        for (int i = 0; i < prices.length - 1; i++) {
            assertEquals(i + 1, new OnlineStockSpan().next(prices[i]));
        }
    }

}