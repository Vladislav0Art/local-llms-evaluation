package leetcode.medium;

public class GeneratedTestCalculateSpans_SinglePrice_ReturnsSpan_WithNoPrefixes {

    @Test
    public void testCalculateSpans_SinglePrice_ReturnsSpan_WithNoPrefixes() {
        // Arrange
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {100};
        int[] spans = new int[prices.length];

        // Act
        stock.calculateSpans(prices);

        // Assert
        assertEquals(1, spans[0]);
    }

}