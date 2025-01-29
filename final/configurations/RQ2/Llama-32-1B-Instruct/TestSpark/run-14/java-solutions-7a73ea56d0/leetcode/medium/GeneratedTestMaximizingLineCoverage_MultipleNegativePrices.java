package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_MultipleNegativePrices {

    @Test
    public void testMaximizingLineCoverage_MultipleNegativePrices() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {-10, -5, 3, 6, 8};
        int[] result = solver.calculateSpans(prices);
        assertEquals(2, result.length);
        assertEquals(-4, result[0]);
        assertEquals(7, result[1]);
    }

}