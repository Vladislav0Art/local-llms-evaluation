package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {3, 2, 2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {25, 26, 27};
        int[] expectedSpans = {4, 3, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {70, 75, 80};
        int[] expectedSpans = {4, 2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 60};
        int[] expectedSpans = {3, 2};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {40, 30};
        int[] expectedSpans = {2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}