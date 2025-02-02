package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_NoSpanTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_NoSpanTest() {
        int[] prices = {1};
        int[] expected = {1};
        int[] result = stockSpan.calculateSpans(prices);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}