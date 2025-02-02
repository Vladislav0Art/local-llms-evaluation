package leetcode.medium;

public class GeneratedTestMaxLineCoverage2 {

    @Test
    public void testMaxLineCoverage2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {25, 26, 27};
        int[] expectedSpans = {4, 3, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}