package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_NegativePrices {

    @Test
    public void testMaximizeLineCoverage_NegativePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {-2};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(1, result[0]);
    }

}