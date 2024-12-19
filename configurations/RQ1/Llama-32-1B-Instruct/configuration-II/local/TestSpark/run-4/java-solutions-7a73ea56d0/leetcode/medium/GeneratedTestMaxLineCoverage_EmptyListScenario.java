package leetcode.medium;

public class GeneratedTestMaxLineCoverage_EmptyListScenario {

    @Test
    public void testMaxLineCoverage_EmptyListScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertThrowsNullPointerException::isInstance;
        onlineStockSpan.calculateSpans(prices);
    }

}