package leetcode.medium;

public class GeneratedTest_calculateSpans_PricingArrayWithOneElement {

    @Test
    public void test_calculateSpans_PricingArrayWithOneElement() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] expectedSpans = {1};

        Object[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}