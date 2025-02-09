package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsWithOneElement {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}