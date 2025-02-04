package leetcode.medium;

public class GeneratedNext_GivenPrice_ReturnsCorrectSpan {

    @Test
    public void next_GivenPrice_ReturnsCorrectSpan() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 100;

        // When
        int span = onlineStockSpan.next(price);

        // Then
        assertEquals(1, span);
    }

}