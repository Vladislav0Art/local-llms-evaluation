package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_MultiNegativePrices {

    @Test
    public void testMaximizeLineCoverage_MultiNegativePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {-2, -3};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(2, result[0]);
    }

}