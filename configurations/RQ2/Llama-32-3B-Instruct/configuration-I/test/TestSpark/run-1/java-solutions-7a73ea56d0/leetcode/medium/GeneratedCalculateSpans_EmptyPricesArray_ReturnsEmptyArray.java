package leetcode.medium;

public class GeneratedCalculateSpans_EmptyPricesArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsEmptyArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        int[] result = {};
        assertArrayEquals(result, instance.calculateSpans(prices));
    }

}