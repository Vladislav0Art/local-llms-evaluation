package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        // Arrange & Act
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60};
        int[] expected = {1, 2, 3, 4, 5};

        // Assert
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}