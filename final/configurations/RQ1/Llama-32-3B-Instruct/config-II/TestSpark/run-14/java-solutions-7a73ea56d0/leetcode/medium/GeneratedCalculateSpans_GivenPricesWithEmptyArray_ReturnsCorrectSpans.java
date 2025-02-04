package leetcode.medium;

public class GeneratedCalculateSpans_GivenPricesWithEmptyArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_GivenPricesWithEmptyArray_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertTrue(spans == null);
    }

}