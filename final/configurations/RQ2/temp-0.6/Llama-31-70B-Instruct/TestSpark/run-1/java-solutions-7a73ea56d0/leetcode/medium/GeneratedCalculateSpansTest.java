package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 10, 15};
        int[] expected = {1, 2, 3, 4};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}