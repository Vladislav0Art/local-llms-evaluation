package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestMaximizeLineCoverage {

    @Test
    public void testMaximizeLineCoverage() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 2, 4, 9, 6};
        int[][] expected = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {0, 1}};
        onlineStockSpan.list = new ArrayList<>(Arrays.asList(7, 2, 4, 9, 6));
        onlineStockSpan.calculateSpans(prices);

        int[] result = onlineStockSpan.calculateSpans(prices);
        assert org.junit.Assert.arrayEquals(expected, result);
    }

}