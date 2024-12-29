package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_EmptyPrices_ReturnsEmptySpans {

    @Test
    public void calculateSpans_EmptyPrices_ReturnsEmptySpans() {
        int[] prices = {};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[0], actualSpans);
    }

}