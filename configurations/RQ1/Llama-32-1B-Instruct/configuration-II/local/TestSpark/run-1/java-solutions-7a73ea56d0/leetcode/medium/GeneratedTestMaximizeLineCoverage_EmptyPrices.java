package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_EmptyPrices {

    @Test
    public void testMaximizeLineCoverage_EmptyPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(1, result[0]);
    }

}