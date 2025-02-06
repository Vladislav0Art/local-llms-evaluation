package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        int[] prices = {10, 9, 8, 7, 6, 5};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

}