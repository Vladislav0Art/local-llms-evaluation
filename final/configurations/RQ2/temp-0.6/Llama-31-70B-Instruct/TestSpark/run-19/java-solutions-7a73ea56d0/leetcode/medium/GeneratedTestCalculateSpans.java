package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}