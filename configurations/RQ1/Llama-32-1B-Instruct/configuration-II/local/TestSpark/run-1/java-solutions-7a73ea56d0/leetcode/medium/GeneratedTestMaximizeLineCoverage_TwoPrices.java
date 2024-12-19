package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_TwoPrices {

    @Test
    public void testMaximizeLineCoverage_TwoPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {1, 2};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(3, result[0]);
    }

}