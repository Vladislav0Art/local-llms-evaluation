package leetcode.medium;

public class GeneratedCalculateSpans_SingleElement_ReturnsOne {

    @Test
    public void calculateSpans_SingleElement_ReturnsOne() {
        // Arrange & Act
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] expected = {1};

        // Assert
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}