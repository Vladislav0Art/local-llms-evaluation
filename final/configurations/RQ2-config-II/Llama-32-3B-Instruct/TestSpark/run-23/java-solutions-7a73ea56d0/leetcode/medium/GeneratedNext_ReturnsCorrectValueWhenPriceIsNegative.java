package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueWhenPriceIsNegative {

    @Test
    public void next_ReturnsCorrectValueWhenPriceIsNegative() {
        // Arrange
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        Stack<Integer> stack = new Stack<>();
        stack.push(-5);
        onlineStockSpan.stack = stack;

        // Act
        int result = onlineStockSpan.next(-2);

        // Assert
        assertEquals(3, result);
    }

}