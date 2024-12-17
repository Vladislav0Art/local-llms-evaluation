package leetcode.medium;

public class GeneratedCalculateSpans_PriceArrayHasOneElement_ReturnsArrayWithOneElement {

    @Test
    public void calculateSpans_PriceArrayHasOneElement_ReturnsArrayWithOneElement() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, result);
    }

}