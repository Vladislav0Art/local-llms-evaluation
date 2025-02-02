package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestCalculateSpans_SingleElementPrices {

    @Test
    public void testCalculateSpans_SingleElementPrices() {
        int[] prices = {100};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, spans);
    }

}