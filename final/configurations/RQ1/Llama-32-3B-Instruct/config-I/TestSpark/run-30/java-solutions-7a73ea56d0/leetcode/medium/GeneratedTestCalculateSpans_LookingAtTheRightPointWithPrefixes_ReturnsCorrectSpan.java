package leetcode.medium;

public class GeneratedTestCalculateSpans_LookingAtTheRightPointWithPrefixes_ReturnsCorrectSpan {

    @Test
    public void testCalculateSpans_LookingAtTheRightPointWithPrefixes_ReturnsCorrectSpan() {
        // Arrange
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] spans = new int[prices.length];

        // Act
        stock.calculateSpans(prices);

        // Assert
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

}