package leetcode.medium;

public class GeneratedTestMaxLineCoverage {

    @Test
    public void testMaxLineCoverage() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] expectedSpans = {1, 1, 2, 1, 2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

}