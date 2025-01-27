package leetcode.medium;

public class GeneratedCalculateSpans_MultipleDecreases_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleDecreases_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 90, 80, 70};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}