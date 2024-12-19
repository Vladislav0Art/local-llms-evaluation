package leetcode.medium;

public class GeneratedTestMaxLineCoverage_1 {

    @Test
    public void testMaxLineCoverage_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3, 1};
        int[] expectedSpans = {1, 1, 2, 1, 2};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}