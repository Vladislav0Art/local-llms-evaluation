package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] expectedSpans = {1, 1, 2, 4, 5, 1};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}