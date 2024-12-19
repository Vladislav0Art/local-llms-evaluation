package leetcode.medium;

public class GeneratedTestMaxLineCoverage_4 {

    @Test
    public void testMaxLineCoverage_4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1000};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}