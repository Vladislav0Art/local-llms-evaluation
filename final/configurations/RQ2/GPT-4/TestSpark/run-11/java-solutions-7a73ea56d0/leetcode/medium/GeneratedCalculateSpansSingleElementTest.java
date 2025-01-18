package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

}