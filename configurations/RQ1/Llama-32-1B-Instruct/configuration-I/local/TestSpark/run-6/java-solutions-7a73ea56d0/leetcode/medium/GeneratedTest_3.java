package leetcode.medium;

public class GeneratedTest_3 {

    @Test
    public void test_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 5};
        int[] expectedSpans = {1, 2, 0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}