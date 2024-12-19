package leetcode.medium;

public class GeneratedTestMaxLineCoverage_7 {

    @Test
    public void testMaxLineCoverage_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}