package leetcode.medium;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 100, 100};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{3}, result);
    }

}