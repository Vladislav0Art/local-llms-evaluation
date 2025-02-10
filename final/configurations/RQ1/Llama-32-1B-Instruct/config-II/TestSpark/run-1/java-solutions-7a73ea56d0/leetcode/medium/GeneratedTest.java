package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

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

    @Test
    public void testMaximizeLineCoverageWithSmallPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[][] expected = {{0}};
        onlineStockSpan.list = new ArrayList<>(Arrays.asList(7, 2, 4, 9, 6));
        onlineStockSpan.calculateSpans(prices);

        int[] result = onlineStockSpan.calculateSpans(prices);
        assert org.junit.Assert.arrayEquals(expected, result);
    }

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