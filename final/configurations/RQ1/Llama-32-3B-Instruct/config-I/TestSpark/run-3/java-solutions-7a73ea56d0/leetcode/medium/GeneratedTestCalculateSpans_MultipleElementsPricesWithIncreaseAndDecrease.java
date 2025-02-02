package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTestCalculateSpans_MultipleElementsPricesWithIncreaseAndDecrease {

    @Test
    public void testCalculateSpans_MultipleElementsPricesWithIncreaseAndDecrease() {
        int[] prices = {10, 15, 20, 30};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 0, 3}, spans);
    }

}