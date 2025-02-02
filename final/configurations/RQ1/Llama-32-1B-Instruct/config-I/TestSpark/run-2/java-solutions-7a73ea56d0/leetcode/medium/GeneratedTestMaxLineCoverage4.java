package leetcode.medium;

public class GeneratedTestMaxLineCoverage4 {

    @Test
    public void testMaxLineCoverage4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 60};
        int[] expectedSpans = {3, 2};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}