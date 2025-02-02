package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestCalculateSpans_MultipleElementsPrices {

    @Test
    public void testCalculateSpans_MultipleElementsPrices() {
        int[] prices = {10, 20, 30};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 0}, spans);
    }

}