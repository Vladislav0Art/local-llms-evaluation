package leetcode.medium;

public class GeneratedTest_calculateSpans_3 {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_calculateSpans_3() {
        int[] prices = {4, 2};
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
        assertEquals(3, result[0]);
    }

}