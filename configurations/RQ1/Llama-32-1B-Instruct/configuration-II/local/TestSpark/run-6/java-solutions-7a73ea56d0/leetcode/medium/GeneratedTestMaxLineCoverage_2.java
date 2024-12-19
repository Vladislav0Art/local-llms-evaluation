package leetcode.medium;

public class GeneratedTestMaxLineCoverage_2 {

    @Test
    public void testMaxLineCoverage_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20};
        int[] expectedSpans = {1, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}