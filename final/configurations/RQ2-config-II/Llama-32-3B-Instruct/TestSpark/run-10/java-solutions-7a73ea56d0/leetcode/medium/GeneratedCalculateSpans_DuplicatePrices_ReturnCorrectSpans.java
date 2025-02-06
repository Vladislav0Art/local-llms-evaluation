package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ReturnCorrectSpans() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {100, 90, 75, 60};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

}