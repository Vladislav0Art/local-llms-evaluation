package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}