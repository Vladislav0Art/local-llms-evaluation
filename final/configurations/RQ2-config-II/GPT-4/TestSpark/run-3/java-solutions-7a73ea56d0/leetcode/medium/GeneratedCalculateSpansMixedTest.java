package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMixedTest {

    @Test
    public void calculateSpansMixedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 20, 10, 30};
        int[] expected = {1, 2, 3, 1, 5};
        assertEquals(expected, stockSpan.calculateSpans(prices));
    }

}