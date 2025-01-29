package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_WithMultiplePrices {

    @Test
    public void testCalculateSpans_WithMultiplePrices() {
        int price = 120;
        int[] prices = new int[]{80, 100, 120};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertEquals(3, result[0]);
        for (int i = 1; i < result.length; i++) {
            assertEquals(i - 1, result[i]);
        }
    }

}