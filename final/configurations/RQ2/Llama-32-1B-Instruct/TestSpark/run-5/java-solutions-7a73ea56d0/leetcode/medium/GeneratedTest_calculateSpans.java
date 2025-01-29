package leetcode.medium;

public class GeneratedTest_calculateSpans {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_calculateSpans() {
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {15, 17, 31, 24, 10};
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
        assertEquals(expected[0], result[0]);
        assertEquals(1, result[1]);
        assertEquals(4, result[2]);
        assertEquals(24, result[3]);
    }

}