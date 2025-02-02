package leetcode.medium;

public class GeneratedTest_calculateSpans_MultiplePricingPoints {

    @Test
    public void test_calculateSpans_MultiplePricingPoints() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        OnlineStockSpan.Spans[] expected = {2, 1, 1};
        int actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}