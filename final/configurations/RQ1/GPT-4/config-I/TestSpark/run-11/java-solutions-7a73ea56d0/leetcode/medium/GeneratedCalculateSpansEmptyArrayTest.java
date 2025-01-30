package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, spans.length);
    }

}