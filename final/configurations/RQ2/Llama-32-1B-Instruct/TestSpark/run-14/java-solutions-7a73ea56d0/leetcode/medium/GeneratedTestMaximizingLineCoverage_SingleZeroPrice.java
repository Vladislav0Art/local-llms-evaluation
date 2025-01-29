package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_SingleZeroPrice {

    @Test
    public void testMaximizingLineCoverage_SingleZeroPrice() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {0};
        int index = 2;
        int[] result = solver.calculateSpans(prices);
        assertEquals(1, result[index - 1]);
        assertEquals(-3, result[index]);
    }

}