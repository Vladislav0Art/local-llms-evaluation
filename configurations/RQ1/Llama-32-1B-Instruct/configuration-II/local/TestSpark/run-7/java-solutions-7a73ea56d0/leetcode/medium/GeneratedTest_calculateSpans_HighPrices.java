package leetcode.medium;

public class GeneratedTest_calculateSpans_HighPrices {

    @Test
    public void test_calculateSpans_HighPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 200, 300};
        int[] expected = {4, 3, 2};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}