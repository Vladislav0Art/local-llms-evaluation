package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSpans_ValuesWithGaps_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_ValuesWithGaps_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 70, 20, 40};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(4, result[2]);
    }

}