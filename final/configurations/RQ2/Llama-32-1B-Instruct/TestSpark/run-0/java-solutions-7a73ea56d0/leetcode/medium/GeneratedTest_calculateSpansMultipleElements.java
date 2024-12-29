package leetcode.medium;

public class GeneratedTest_calculateSpansMultipleElements {

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
    public void test_calculateSpansMultipleElements() {
        // Arrange
        OnlineStockSpan.onlineStock = new OnlineStockSpan();

        // Act
        OnlineStockSpan.onlineStock.calculateSpans(new int[]{5, 6, 7});

        // Assert
        assertArrayEquals(new int[]{0, 1}, calculateSpans(new int[]{5, 6, 7}));
    }
}

class OnlineStock {
    public void next(int price) {
    }

    public int[] calculateSpans(int[] prices) {
    }

}