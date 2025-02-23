package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_emptyPrices {

    @Test
    public void calculateSpans_emptyPrices() {
        int[] prices = {};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertEquals(0, spans.length);
    }

}