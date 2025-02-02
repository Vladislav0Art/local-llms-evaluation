package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(2, result[3]);
        assertEquals(4, result[4]);
        assertEquals(2, result[5]);
    }

}