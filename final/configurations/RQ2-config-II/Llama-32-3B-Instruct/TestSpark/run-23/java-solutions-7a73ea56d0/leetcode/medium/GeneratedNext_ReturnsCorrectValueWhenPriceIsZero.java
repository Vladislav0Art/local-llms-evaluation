package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueWhenPriceIsZero {

    @Test
    public void next_ReturnsCorrectValueWhenPriceIsZero() {
        // Arrange
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        // Act
        int result = onlineStockSpan.next(0);

        // Assert
        assertEquals(1, result);
    }

}