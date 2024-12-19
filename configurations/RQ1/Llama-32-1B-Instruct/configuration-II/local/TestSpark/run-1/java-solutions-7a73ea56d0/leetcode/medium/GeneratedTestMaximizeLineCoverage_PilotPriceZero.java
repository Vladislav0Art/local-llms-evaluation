package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_PilotPriceZero {

    @Test
    public void testMaximizeLineCoverage_PilotPriceZero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {2, 3};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(1, result[0]);
    }

}