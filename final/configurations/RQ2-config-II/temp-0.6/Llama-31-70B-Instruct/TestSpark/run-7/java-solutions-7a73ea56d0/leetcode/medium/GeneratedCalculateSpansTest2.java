package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] expectedSpans = {1, 1, 2, 4, 5, 1};

        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] actualSpans = stockSpan.calculateSpans(prices);

        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < expectedSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}