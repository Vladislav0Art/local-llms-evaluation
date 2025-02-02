package leetcode.medium;

public class GeneratedTestCalculateSpans_TwoPrices_ReturnsCorrectSpans {

    @Test
    public void testCalculateSpans_TwoPrices_ReturnsCorrectSpans() {
        // Arrange
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 20};
        int[] spans = new int[prices.length];

        // Act
        stock.calculateSpans(prices);

        // Assert
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
    }

}