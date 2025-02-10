package leetcode.medium;

public class GeneratedTest_maxLineCoverage {

    @Test
    public void test_maxLineCoverage() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] result = instance.calculateSpans(prices);
        assertEquals(5, result[0]);
        for (int i = 1; i < prices.length; i++) {
            assertEquals(i + 1, result[i], "Span of price at index " + i + " should be " + i + ", but is " + result[i] + " instead");
        }
    }

}