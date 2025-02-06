package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSpans_SingleElementInput_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElementInput_ReturnsCorrectSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}