package leetcode.medium;

public class GeneratedNext_IncreasingPrice_ReturnsOne {

    @Test
    public void next_IncreasingPrice_ReturnsOne() {
        // Arrange & Act
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 100;
        int expected = 1;

        // Assert
        assertEquals(expected, stockSpan.next(price));
    }

}