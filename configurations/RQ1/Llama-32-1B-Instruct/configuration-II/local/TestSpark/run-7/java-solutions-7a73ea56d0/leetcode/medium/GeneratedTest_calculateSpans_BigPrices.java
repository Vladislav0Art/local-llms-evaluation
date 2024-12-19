package leetcode.medium;

public class GeneratedTest_calculateSpans_BigPrices {

    @Test
    public void test_calculateSpans_BigPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 200, 300};
        int[] expected = {1, 2, 3};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}