package leetcode.medium;

public class GeneratedTest_calculateSpans_int_price_maxPrice {

    @Test
    public void test_calculateSpans_int_price_maxPrice() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {1, 2};
        int[] actual = sut.calculateSpans(prices);
        for (int i : actual) {
            assert i == 0;
        }
    }

}