package leetcode.medium;

public class GeneratedTest_calculateSpans_PricingArrayWithFloatValues {

    @Test
    public void test_calculateSpans_PricingArrayWithFloatValues() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        double[] prices = {10.0, 20.0, 30.0};
        int[] expectedSpans = {1, 2, 3};

        Object[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}