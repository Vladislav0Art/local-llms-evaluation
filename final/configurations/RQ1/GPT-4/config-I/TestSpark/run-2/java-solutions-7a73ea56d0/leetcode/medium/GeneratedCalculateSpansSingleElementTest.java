package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expectedSpans = {1};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}