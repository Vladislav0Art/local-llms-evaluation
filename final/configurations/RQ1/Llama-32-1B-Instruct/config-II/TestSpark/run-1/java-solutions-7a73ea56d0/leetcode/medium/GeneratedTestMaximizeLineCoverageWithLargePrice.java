package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestMaximizeLineCoverageWithLargePrice {

    @Test
    public void testMaximizeLineCoverageWithLargePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10000, 2000, 3000, 4000};
        int[][] expected = {{1}, {2}, {3}, {4}};
        onlineStockSpan.list = new ArrayList<>(Arrays.asList(10000, 2000, 3000, 4000));
        onlineStockSpan.calculateSpans(prices);

        int[] result = onlineStockSpan.calculateSpans(prices);
        assert org.junit.Assert.arrayEquals(expected, result);
    }

}