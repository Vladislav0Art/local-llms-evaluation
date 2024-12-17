package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_SingleScenario {

    @Test
    public void testMaximizeLineCoverage_SingleScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result); // Span of first element is 1
    }

}