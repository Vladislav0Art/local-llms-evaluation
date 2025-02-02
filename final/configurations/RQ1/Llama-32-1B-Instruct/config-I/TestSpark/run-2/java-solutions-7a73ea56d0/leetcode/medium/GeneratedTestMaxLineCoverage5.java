package leetcode.medium;

public class GeneratedTestMaxLineCoverage5 {

    @Test
    public void testMaxLineCoverage5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {40, 30};
        int[] expectedSpans = {2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}