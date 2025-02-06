package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueWhenPriceIsPositive {

    @Test
    public void next_ReturnsCorrectValueWhenPriceIsPositive() {
        // Arrange
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        onlineStockSpan.stack = stack;

        // Act
        int result = onlineStockSpan.next(15);

        // Assert
        assertEquals(2, result);
    }

}