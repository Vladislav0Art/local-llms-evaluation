package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCalculateSpans_MultiplePrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultiplePrices_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

}