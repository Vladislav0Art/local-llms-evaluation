package leetcode.medium;

public class GeneratedTest_calculateSpans_LowPrices {

    @Test
    public void test_calculateSpans_LowPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2, 3};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}