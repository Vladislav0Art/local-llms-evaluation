package leetcode.medium;

public class GeneratedTestMaxLineCoverage_SmallScenario {

    @Test
    public void testMaxLineCoverage_SmallScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}