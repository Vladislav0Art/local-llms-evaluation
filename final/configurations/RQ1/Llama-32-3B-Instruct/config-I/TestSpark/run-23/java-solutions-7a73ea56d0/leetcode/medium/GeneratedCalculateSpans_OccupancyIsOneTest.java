package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_OccupancyIsOneTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_OccupancyIsOneTest() {
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = stockSpan.calculateSpans(prices);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}