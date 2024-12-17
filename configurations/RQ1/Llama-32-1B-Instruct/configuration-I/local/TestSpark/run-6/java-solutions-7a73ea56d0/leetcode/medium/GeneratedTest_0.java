package leetcode.medium;

public class GeneratedTest_0 {

    @Test
    public void test_0() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 3, 6, 4};
        int[] expectedSpans = {1, 1, 2, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}