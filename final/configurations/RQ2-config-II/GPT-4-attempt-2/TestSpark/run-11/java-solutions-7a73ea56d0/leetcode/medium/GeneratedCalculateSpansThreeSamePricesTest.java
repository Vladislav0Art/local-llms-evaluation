package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansThreeSamePricesTest {

    @Test
    public void calculateSpansThreeSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100};

        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

}