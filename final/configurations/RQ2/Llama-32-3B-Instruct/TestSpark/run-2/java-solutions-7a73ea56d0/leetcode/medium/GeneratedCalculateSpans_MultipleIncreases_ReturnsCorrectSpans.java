package leetcode.medium;

public class GeneratedCalculateSpans_MultipleIncreases_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleIncreases_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}