package leetcode.medium;

public class GeneratedCalculateSpans_GivenPrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_GivenPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
        assertEquals(4, spans[3]);
    }

}