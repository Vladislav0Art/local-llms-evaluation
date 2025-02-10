package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestMaximizeLineCoverageWithNoElements {

    @Test
    public void testMaximizeLineCoverageWithNoElements() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[][] expected = {{0}};
        onlineStockSpan.list = new ArrayList<>(Arrays.asList(7, 2, 4, 9, 6));
        onlineStockSpan.calculateSpans(prices);

        int[] result = onlineStockSpan.calculateSpans(prices);
        assert org.junit.Assert.arrayEquals(expected, result);
    }

}