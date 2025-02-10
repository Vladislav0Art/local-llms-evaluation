package leetcode.medium;

public class GeneratedTestCalculateSpans_DifferentPrices {

    @Test
    public void testCalculateSpans_DifferentPrices() {
        OnlineStockSpan test = new OnlineStockSpan();
        int[] prices = {1.5, 2, 3};
        int[] expected = {0, 1, 1, 2, 3};
        int[] actual = test.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}