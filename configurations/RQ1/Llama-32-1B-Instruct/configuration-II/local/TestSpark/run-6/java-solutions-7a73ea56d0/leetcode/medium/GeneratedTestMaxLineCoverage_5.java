package leetcode.medium;

public class GeneratedTestMaxLineCoverage_5 {

    @Test
    public void testMaxLineCoverage_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}