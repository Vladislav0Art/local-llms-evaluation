package leetcode.medium;

public class GeneratedCalculateSpans_SingleElementArray_Returns_ArrayWithOneElement {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_Returns_ArrayWithOneElement() {
        int[] prices = {100};
        assertArrayEquals(new int[]{1}, onlineStockSpan.calculateSpans(prices));
    }

}