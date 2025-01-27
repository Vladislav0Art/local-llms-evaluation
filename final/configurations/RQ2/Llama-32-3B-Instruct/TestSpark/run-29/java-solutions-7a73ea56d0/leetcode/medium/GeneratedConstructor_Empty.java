package leetcode.medium;

public class GeneratedConstructor_Empty {

    @Test
    public void constructor_Empty() {
        // Arrange & Act
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = {};

        // Assert
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[0]));
    }

}