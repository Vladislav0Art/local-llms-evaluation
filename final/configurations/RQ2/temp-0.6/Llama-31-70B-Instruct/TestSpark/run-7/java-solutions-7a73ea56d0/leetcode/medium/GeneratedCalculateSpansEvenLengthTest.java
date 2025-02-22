package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansEvenLengthTest {

    @Test
    public void calculateSpansEvenLengthTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 2, 3, 4};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
        assertEquals(4, spans[3]);
    }

}