package leetcode.medium;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}