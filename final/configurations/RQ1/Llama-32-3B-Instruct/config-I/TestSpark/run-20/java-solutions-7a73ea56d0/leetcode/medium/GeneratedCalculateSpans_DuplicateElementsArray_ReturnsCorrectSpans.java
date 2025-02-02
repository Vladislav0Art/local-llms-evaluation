package leetcode.medium;

public class GeneratedCalculateSpans_DuplicateElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicateElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 10, 10, 10};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(2, result[3]);
    }

}