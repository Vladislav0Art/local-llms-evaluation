package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTestMaximizingLineCoverage_SingleIndexWithNegativePrice {

    @Test
    public void testMaximizingLineCoverage_SingleIndexWithNegativePrice() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {-10};
        int index = 2;
        int[] result = solver.calculateSpans(prices);
        assertEquals(0, result[index - 1]);
        assertEquals(-4, result[index]);
    }

}