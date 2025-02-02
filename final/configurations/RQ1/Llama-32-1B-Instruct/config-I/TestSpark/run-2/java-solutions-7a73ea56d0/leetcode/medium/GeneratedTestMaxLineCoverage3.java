package leetcode.medium;

public class GeneratedTestMaxLineCoverage3 {

    @Test
    public void testMaxLineCoverage3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {70, 75, 80};
        int[] expectedSpans = {4, 2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}