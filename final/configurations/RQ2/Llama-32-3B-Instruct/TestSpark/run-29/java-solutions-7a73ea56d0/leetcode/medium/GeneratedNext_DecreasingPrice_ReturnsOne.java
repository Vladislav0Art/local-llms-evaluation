package leetcode.medium;

public class GeneratedNext_DecreasingPrice_ReturnsOne {

    @Test
    public void next_DecreasingPrice_ReturnsOne() {
        // Arrange & Act
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 100;
        int expected = 1;

        // Assert
        assertEquals(expected, stockSpan.next(price));
    }

}