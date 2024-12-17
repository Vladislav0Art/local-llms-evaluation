package leetcode.medium;

public class GeneratedCalculateSpans_PriceArrayIsEmpty_ReturnsEmptyArray {

    @Test
    public void calculateSpans_PriceArrayIsEmpty_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

}