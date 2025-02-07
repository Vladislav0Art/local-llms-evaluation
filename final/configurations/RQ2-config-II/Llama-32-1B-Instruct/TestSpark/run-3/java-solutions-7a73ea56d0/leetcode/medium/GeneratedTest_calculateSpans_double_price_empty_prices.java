package leetcode.medium;

public class GeneratedTest_calculateSpans_double_price_empty_prices {

    @Test
    public void test_calculateSpans_double_price_empty_prices() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {};
        try {
            sut.calculateSpans(prices);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}