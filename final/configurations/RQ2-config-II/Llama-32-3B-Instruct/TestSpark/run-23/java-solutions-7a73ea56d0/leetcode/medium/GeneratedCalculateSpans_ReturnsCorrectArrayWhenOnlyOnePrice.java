package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsCorrectArrayWhenOnlyOnePrice {

    @Test
    public void calculateSpans_ReturnsCorrectArrayWhenOnlyOnePrice() {
        // Arrange
        int[] prices = {1};
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        onlineStockSpan.stack = stack;

        // Act
        int[] result = onlineStockSpan.calculateSpans(prices);

        // Assert
        assertArrayEquals(new int[]{new OnlineStockSpan()[0]}, result);
    }

}