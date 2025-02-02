package leetcode.medium;

public class GeneratedTest_calculateSpans_MultiplePricingPoints_PushBackToTop_CycleDetection {

    @Test
    public void test_calculateSpans_MultiplePricingPoints_PushBackToTop_CycleDetection() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4};
        onlineStockSpan.next(5);
        assertEquals(5, onlineStockSpan.next(prices));
    }

}