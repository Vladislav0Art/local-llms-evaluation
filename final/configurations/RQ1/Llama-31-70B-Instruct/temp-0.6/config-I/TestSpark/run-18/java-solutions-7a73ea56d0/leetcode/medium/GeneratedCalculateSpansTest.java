package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 15, 10, 20, 8};
        int[] expectedSpans = {1, 1, 2, 1, 4, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);
        for (int i = 0; i < expectedSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}