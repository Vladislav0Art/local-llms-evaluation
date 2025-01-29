package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_SinglePrice {

    @Test
    public void testMaximizingLineCoverage_SinglePrice() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = solver.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

}