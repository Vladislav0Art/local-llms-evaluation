package leetcode.medium;

public class GeneratedTest_calculateSpans_PricingArrayWithMultipleElements {

    @Test
    public void test_calculateSpans_PricingArrayWithMultipleElements() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expectedSpans = {1, 1, 2};

        Object[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}