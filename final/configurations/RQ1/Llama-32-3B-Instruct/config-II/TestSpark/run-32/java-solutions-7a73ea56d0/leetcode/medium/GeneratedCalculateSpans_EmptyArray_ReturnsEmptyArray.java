package leetcode.medium;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[0]);
    }

}