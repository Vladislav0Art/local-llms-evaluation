package leetcode.medium;

public class GeneratedCalculateSpans_EmptyArray_Returns_EmptyArray {

    @Test
    public void calculateSpans_EmptyArray_Returns_EmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{});
        assertEquals(0, result.length);
    }

}