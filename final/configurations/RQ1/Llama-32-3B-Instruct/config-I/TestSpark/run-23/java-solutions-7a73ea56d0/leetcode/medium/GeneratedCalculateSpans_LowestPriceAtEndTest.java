package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_LowestPriceAtEndTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_LowestPriceAtEndTest() {
        int[] prices = {1, 2, 3};
        int[] expected = {1, 3, 5};
        int[] result = stockSpan.calculateSpans(prices);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}