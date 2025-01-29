package leetcode.medium;

public class GeneratedTest_calculateSpans_2 {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_calculateSpans_2() {
        int[] prices = {5};
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
        assertEquals(1, result[0]);
    }

}