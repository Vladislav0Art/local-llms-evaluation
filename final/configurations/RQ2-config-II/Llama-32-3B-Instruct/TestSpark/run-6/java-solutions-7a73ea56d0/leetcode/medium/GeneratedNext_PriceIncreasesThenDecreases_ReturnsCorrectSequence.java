package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_PriceIncreasesThenDecreases_ReturnsCorrectSequence {

    @Test
    public void next_PriceIncreasesThenDecreases_ReturnsCorrectSequence() {
        int[] prices = {10, 9, 8, 7, 6, 5, 4};
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] > prices[i]) {
                assertEquals(i + 1, new OnlineStockSpan().next(prices[i]));
            } else if (prices[i - 1] < prices[i]) {
                assertEquals(1, new OnlineStockSpan().next(prices[i]));
            }
        }
    }

}