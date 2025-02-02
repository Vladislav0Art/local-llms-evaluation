package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestCalculateSpans_MultipleElementsPricesWithDecrease {

    @Test
    public void testCalculateSpans_MultipleElementsPricesWithDecrease() {
        int[] prices = {10, 5, 20, 15};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 0, 1, 4}, spans);
    }

}