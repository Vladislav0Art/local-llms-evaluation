package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {60, 80, 40, 90, 120};
        int[] expectedSpans = {1, 1, 4, 2, 1};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}