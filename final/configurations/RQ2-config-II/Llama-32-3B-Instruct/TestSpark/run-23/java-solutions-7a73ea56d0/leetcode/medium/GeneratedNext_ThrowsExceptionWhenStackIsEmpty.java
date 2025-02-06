package leetcode.medium;

public class GeneratedNext_ThrowsExceptionWhenStackIsEmpty {

    @Test
    public void next_ThrowsExceptionWhenStackIsEmpty() {
        // Arrange
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();

        // Act and Assert
        assertThrows(IndexOutOfBoundsException.class, () -> onlineStockSpan.next(-5));
    }

}