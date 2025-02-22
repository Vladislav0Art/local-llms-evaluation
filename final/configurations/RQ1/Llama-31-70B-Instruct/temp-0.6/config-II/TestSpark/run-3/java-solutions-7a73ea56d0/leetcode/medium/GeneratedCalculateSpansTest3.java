package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest3 {

    @Test
    public void calculateSpansTest3() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 99, 98, 97};
        int[] expectedSpans = {1, 1, 1, 1};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}