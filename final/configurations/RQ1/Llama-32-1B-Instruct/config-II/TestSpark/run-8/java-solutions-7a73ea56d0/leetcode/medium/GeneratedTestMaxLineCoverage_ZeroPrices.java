package leetcode.medium;

public class GeneratedTestMaxLineCoverage_ZeroPrices {

    @Test
    public void testMaxLineCoverage_ZeroPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {0, 1, 2};
        int[] expectedSpans = {};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

}