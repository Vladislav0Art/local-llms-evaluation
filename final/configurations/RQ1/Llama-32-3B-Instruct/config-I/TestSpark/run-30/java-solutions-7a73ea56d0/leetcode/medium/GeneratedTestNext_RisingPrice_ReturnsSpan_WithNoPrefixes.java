package leetcode.medium;

public class GeneratedTestNext_RisingPrice_ReturnsSpan_WithNoPrefixes {

    @Test
    public void testNext_RisingPrice_ReturnsSpan_WithNoPrefixes() {
        // Arrange
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.list.add(-10);

        // Act
        int result = stock.next(-8);

        // Assert
        assertEquals(1, result);
    }

}