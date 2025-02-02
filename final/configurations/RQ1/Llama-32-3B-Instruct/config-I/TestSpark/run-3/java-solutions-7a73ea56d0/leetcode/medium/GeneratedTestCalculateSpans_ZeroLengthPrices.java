package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestCalculateSpans_ZeroLengthPrices {

    @Test
    public void testCalculateSpans_ZeroLengthPrices() {
        int[] prices = {};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{}, spans);
    }

}