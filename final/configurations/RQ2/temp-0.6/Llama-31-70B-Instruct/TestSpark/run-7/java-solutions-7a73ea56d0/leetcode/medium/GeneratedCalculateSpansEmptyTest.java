package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansEmptyTest {

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[0];
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(0, spans.length);
    }

}