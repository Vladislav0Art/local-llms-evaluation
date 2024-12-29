package leetcode.medium;

public class GeneratedTest_calculateSpans_emptyArray {

    public int next(int price) {
        return onlineStockSpan.next(price);
    }

    public int[] calculateSpans(int[] prices) {
        return onlineStockSpan.calculateSpans(prices);
    }
}

public class TestOnlineStockSpan {

    private final OnlineStockSpan onlineStockSpan;

    public TestOnlineStockSpan() {
        this.onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void test_calculateSpans_emptyArray() {
        // Arrange
        OnlineStockSpan.onlineStock = new OnlineStockSpan();

        // Act
        OnlineStockSpan.onlineStock.calculateSpans(new int[]{});

        // Assert
        assertArrayEquals(new int[]{}, calculateSpans(new int[]{}));
    }

}