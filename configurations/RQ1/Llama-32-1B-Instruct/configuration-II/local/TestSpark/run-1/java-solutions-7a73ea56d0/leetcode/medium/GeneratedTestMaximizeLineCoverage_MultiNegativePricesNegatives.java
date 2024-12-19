package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_MultiNegativePricesNegatives {

    @Test
    public void testMaximizeLineCoverage_MultiNegativePricesNegatives() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {-3, -2};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(1, result[0]);
    }

}