package leetcode.medium;

public class GeneratedTestMaxLineCoverage_EmptyPrices {

    @Test
    public void testMaxLineCoverage_EmptyPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

}