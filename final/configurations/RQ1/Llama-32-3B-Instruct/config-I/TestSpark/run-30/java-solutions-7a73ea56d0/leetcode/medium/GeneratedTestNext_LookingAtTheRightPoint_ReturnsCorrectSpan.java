package leetcode.medium;

public class GeneratedTestNext_LookingAtTheRightPoint_ReturnsCorrectSpan {

    @Test
    public void testNext_LookingAtTheRightPoint_ReturnsCorrectSpan() {
        // Arrange
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.list.add(-10);
        stock.list.add(-9);
        stock.list.add(-8);

        // Act
        int result = stock.next(-7);

        // Assert
        assertEquals(2, result);
    }

}