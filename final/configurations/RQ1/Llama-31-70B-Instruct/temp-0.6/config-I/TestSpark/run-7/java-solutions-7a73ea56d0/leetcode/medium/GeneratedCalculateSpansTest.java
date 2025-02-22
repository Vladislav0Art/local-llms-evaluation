package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(1, spans[2]);
        assertEquals(2, spans[3]);
        assertEquals(1, spans[4]);
        assertEquals(4, spans[5]);
        assertEquals(6, spans[6]);
    }

}