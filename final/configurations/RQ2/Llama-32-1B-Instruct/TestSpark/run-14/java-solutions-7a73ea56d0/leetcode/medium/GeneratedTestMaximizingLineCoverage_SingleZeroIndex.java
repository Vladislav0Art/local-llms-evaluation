package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_SingleZeroIndex {

    @Test
    public void testMaximizingLineCoverage_SingleZeroIndex() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {0};
        int index = 1;
        int[] result = solver.calculateSpans(prices);
        assertEquals(0, result[index - 1]);
        assertEquals(-3, result[index]);
    }

}