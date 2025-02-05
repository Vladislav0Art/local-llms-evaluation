package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansDecrementalTest {

    @Test
    public void calculateSpansDecrementalTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expected = {1, 1, 1, 1, 1};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}