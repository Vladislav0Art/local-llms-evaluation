package leetcode.medium;

public class GeneratedCalculateSpans_IndividualPrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_IndividualPrices_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 125};
        int[] result = {2, 1, 1, 4};
        assertArrayEquals(result, instance.calculateSpans(prices));
    }

}