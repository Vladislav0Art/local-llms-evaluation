package leetcode.medium;

public class GeneratedTest_7 {

    @Test
    public void test_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 1};
        int[] expectedSpans = {0, 0, 0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}