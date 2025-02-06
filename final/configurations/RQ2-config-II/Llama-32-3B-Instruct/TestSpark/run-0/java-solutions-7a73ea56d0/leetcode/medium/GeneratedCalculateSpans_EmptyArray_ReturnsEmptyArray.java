package leetcode.medium;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

}