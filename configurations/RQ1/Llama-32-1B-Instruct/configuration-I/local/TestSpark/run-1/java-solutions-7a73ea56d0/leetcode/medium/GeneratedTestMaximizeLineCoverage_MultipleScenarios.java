package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_MultipleScenarios {

    @Test
    public void testMaximizeLineCoverage_MultipleScenarios() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 6, 5, 0, 9, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{4}, result); // Span of first element is 4
    }

}