package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_SimpleScenario {

    @Test
    public void testMaximizingLineCoverage_SimpleScenario() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] result = solver.calculateSpans(prices);
        assertEquals(2, result.length);
        assertEquals(4, result[0]);
        assertEquals(8, result[1]);
    }

}