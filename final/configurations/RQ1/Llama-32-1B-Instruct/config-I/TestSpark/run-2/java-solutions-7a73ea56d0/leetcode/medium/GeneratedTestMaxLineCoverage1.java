package leetcode.medium;

public class GeneratedTestMaxLineCoverage1 {

    @Test
    public void testMaxLineCoverage1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {3, 2, 2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}