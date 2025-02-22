package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expectedSpans = {1, 1, 1};
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}