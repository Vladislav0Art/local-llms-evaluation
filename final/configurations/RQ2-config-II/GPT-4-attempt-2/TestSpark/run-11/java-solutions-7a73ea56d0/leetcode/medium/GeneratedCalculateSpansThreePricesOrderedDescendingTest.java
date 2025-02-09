package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansThreePricesOrderedDescendingTest {

    @Test
    public void calculateSpansThreePricesOrderedDescendingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {120, 100, 80};

        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

}