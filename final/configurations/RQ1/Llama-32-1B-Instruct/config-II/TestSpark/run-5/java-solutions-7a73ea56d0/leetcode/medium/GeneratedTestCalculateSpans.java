package leetcode.medium;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan test = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expected = {0, 1, 1, 2, 3};
        int[] actual = test.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}