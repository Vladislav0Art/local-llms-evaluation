package leetcode.medium;

public class GeneratedTest_maxLineCoverageSmallArray {

    @Test
    public void test_maxLineCoverageSmallArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] result = instance.calculateSpans(prices);
        assertEquals(4, result[0]);
        for (int i = 1; i < prices.length; i++) {
            assertEquals(i + 1, result[i], "Span of price at index " + i + " should be " + i + ", but is " + result[i] + " instead");
        }
    }

}