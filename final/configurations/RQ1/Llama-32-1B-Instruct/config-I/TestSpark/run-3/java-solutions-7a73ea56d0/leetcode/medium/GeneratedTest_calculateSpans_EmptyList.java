package leetcode.medium;

public class GeneratedTest_calculateSpans_EmptyList {

    @Test
    public void test_calculateSpans_EmptyList() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        OnlineStockSpan.Spans[] expected = {0};
        int actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}