package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMultipleElementsTest {

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(prices.length, spans.length);
        assertEquals(1, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(1, spans[2]);
        assertEquals(1, spans[3]);
        assertEquals(2, spans[4]);
        assertEquals(1, spans[5]);
        assertEquals(4, spans[6]);
    }

}