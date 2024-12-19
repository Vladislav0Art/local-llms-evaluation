package leetcode.medium;

public class GeneratedCalculateOneSpan {

    @Test
    public void calculateOneSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] expected = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}