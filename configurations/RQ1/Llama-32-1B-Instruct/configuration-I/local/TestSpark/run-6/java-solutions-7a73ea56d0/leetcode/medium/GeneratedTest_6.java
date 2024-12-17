package leetcode.medium;

public class GeneratedTest_6 {

    @Test
    public void test_6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expectedSpans = {1, 2, 0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}