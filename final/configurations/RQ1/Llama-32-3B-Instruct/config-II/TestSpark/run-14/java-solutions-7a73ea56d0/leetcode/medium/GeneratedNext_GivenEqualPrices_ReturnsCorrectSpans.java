package leetcode.medium;

public class GeneratedNext_GivenEqualPrices_ReturnsCorrectSpans {

    @Test
    public void next_GivenEqualPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

}