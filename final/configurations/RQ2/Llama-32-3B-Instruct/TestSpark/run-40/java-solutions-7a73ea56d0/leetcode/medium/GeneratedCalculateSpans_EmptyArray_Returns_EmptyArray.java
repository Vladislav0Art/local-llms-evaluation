package leetcode.medium;

public class GeneratedCalculateSpans_EmptyArray_Returns_EmptyArray {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_Returns_EmptyArray() {
        int[] prices = new int[0];
        assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(prices));
    }

}