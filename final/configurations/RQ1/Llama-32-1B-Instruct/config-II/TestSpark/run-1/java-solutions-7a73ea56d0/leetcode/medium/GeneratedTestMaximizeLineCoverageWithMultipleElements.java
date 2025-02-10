package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestMaximizeLineCoverageWithMultipleElements {

    @Test
    public void testMaximizeLineCoverageWithMultipleElements() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 2, 4, 9, 6, 5};
        int[][] expected = {{1, 3}, {6, 0}};
        onlineStockSpan.list = new ArrayList<>(Arrays.asList(7, 2, 4, 9, 6, 5));
        onlineStockSpan.calculateSpans(prices);

        int[] result = onlineStockSpan.calculateSpans(prices);
        assert org.junit.Assert.arrayEquals(expected, result);
    }

}