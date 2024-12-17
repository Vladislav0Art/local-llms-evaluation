package leetcode.medium;

public class GeneratedTest_2 {

    @Test
    public void test_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4, 3};
        int[] expectedSpans = {1, 1, 2};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}