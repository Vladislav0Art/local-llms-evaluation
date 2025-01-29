package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_MultiplePrices {

    @Test
    public void testMaximizingLineCoverage_MultiplePrices() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] result = solver.calculateSpans(prices);
        assertEquals(2, result.length);
        assertEquals(8, result[0]);
        assertEquals(14, result[1]);
    }

}