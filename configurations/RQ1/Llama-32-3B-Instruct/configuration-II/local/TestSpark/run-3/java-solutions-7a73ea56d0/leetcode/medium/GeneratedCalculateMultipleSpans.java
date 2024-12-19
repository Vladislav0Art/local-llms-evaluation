package leetcode.medium;

public class GeneratedCalculateMultipleSpans {

    @Test
    public void calculateMultipleSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {2, 4, 0, 3, 2, 5, 3, 7};
        int[] expected = {1, 2, 1, 4, 2, 3, 2, 4};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}