package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsCorrectArrayWhenMultiplePrices {

    @Test
    public void calculateSpans_ReturnsCorrectArrayWhenMultiplePrices() {
        // Arrange
        int[] prices = {10, 15, -2};
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(5);
        onlineStockSpan.stack = stack;

        // Act
        int[] result = onlineStockSpan.calculateSpans(prices);

        // Assert
        assertArrayEquals(new int[]{new OnlineStockSpan()[0], 2, 3}, result);
    }

}