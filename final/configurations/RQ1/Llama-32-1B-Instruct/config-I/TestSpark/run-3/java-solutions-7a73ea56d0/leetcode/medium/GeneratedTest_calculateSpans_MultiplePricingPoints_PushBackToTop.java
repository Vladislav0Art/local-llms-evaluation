package leetcode.medium;

public class GeneratedTest_calculateSpans_MultiplePricingPoints_PushBackToTop {

    @Test
    public void test_calculateSpans_MultiplePricingPoints_PushBackToTop() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        OnlineStockSpan.Spans[] expected = {4, 3, 2, 1};
        for (int i : prices) {
            onlineStockSpan.next(i);
        }
        OnlineStockSpan.Spans actual = new ArrayList<>();
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}