package leetcode.medium;

public class GeneratedTestMaxLineCoverage_SimpleScenario {

    @Test
    public void testMaxLineCoverage_SimpleScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(2, result[1]);
    }

}