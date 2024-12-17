package leetcode.medium;

public class GeneratedTest_4 {

    @Test
    public void test_4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {1, 2, 3, 0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}