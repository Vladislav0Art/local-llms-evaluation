package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_MultiplePrices {

    @Test
    public void testMaximizeLineCoverage_MultiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {1, 2, 3};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(6, result[0]);
    }

}