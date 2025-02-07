package leetcode.medium;

public class GeneratedTest_calculateSpans_double_price_maxPrice {

    @Test
    public void test_calculateSpans_double_price_maxPrice() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {1.01d, 2.02d};
        int[] actual = sut.calculateSpans(prices);
        for (int i : actual) {
            assert i == 0;
        }
    }

}