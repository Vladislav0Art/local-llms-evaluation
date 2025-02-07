package leetcode.medium;

public class GeneratedTest_calculateSpans_int_price {

    @Test
    public void test_calculateSpans_int_price() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expected = {0, 1, 2};
        int actual = sut.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assert actual[i] == expected[i];
        }
    }

}