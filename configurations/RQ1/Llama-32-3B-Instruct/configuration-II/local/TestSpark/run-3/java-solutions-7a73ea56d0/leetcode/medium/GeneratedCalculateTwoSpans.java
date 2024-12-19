package leetcode.medium;

public class GeneratedCalculateTwoSpans {

    @Test
    public void calculateTwoSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {2, 4};
        int[] expected = {1, 2};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}