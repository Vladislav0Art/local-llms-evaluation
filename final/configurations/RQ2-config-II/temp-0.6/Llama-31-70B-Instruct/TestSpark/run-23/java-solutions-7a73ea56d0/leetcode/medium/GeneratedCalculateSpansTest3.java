package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest3 {

    @Test
    public void calculateSpansTest3() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10, 10, 10};
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}