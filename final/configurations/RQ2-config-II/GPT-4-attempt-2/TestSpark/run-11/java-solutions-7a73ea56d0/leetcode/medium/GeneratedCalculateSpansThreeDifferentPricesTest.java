package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansThreeDifferentPricesTest {

    @Test
    public void calculateSpansThreeDifferentPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 120};

        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(1, spans[2]);
    }

}