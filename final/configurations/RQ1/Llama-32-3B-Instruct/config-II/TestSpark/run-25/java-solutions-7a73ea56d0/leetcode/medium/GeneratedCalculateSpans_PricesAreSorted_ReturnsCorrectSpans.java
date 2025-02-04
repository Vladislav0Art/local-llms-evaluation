package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_PricesAreSorted_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PricesAreSorted_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 90, 75, 60};
        int[] result = stockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertEquals(4, result.length);
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                assertTrue(result[i] >= result[i - 1]);
            }
        }
    }

}