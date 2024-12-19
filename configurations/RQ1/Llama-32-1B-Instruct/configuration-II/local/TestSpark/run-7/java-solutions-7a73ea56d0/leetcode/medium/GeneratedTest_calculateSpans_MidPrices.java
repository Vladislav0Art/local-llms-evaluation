package leetcode.medium;

public class GeneratedTest_calculateSpans_MidPrices {

    @Test
    public void test_calculateSpans_MidPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2};
        int[] expected = {3, 1, 0};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}