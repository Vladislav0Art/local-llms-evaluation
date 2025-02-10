package leetcode.medium;

public class GeneratedTestMaxLineCoverage_SingleElementPrices {

    @Test
    public void testMaxLineCoverage_SingleElementPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5};
        int[] expectedSpans = {};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

}