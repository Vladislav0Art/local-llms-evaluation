package leetcode.medium;

public class GeneratedTestMaxLineCoverage_3 {

    @Test
    public void testMaxLineCoverage_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 3000, 15, 127, 40};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}