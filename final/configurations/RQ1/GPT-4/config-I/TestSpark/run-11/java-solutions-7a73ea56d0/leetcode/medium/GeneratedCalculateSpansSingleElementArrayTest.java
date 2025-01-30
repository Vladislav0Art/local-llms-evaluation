package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansSingleElementArrayTest {

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

}