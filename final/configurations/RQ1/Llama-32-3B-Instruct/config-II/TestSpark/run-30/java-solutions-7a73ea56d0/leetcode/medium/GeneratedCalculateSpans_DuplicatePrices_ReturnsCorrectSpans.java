package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 150, 80, 90, 100};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(spans, new int[]{1, 2, 3, 4, 5});
    }

}