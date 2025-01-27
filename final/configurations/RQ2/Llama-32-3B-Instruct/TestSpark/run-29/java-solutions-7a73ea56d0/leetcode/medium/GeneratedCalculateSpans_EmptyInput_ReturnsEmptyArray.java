package leetcode.medium;

public class GeneratedCalculateSpans_EmptyInput_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        // Arrange & Act
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};

        // Assert
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}