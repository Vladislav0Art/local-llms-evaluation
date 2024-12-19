package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_PilotPrice {

    @Test
    public void testMaximizeLineCoverage_PilotPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {2};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(1, result[0]);
    }

}