package leetcode.medium;

public class GeneratedTest_5 {

    @Test
    public void test_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 300, 500};
        int[] expectedSpans = {2, 3, 0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}