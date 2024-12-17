package leetcode.medium;

public class GeneratedTest_calculateSpans_PricingArrayWithNegativeNumbers {

    @Test
    public void test_calculateSpans_PricingArrayWithNegativeNumbers() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-10, 20, -30};
        int[] expectedSpans = {1, 2, 3};

        Object[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}