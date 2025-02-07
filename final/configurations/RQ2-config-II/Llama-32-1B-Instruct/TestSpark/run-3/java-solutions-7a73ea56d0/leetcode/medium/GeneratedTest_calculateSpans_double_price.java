package leetcode.medium;

public class GeneratedTest_calculateSpans_double_price {

    @Test
    public void test_calculateSpans_double_price() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {1.01d, 2.02d};
        int[] expected = {0, 0};
        int actual = sut.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assert actual[i] == expected[i];
        }
    }

}