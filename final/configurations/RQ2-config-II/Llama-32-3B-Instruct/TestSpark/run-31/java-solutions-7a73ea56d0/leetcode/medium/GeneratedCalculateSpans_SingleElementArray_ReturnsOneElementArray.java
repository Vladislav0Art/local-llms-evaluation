package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsOneElementArray {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsOneElementArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}