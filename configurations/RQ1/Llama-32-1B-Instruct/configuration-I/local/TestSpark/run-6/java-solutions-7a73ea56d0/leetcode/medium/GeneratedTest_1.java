package leetcode.medium;

public class GeneratedTest_1 {

    @Test
    public void test_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3};
        int[] expectedSpans = {2, 2, 3, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}