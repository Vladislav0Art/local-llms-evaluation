package leetcode.medium;

public class GeneratedTest_maxLineCoverageZero {

    @Test
    public void test_maxLineCoverageZero() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {0, 1};
        int[] result = instance.calculateSpans(prices);
        assertEquals(2, result[0]);
        for (int i = 1; i < prices.length; i++) {
            assertEquals(i + 1, result[i], "Span of price at index " + i + " should be " + i + ", but is " + result[i] + " instead");
        }
    }

}