package leetcode.medium;

public class GeneratedTest_calculateSpans_SmallPrices {

    @Test
    public void test_calculateSpans_SmallPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expected = {3, 2, 1};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}