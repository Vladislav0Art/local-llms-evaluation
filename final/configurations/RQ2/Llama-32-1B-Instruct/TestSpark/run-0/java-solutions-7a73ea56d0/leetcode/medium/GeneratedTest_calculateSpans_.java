package leetcode.medium;

public class GeneratedTest_calculateSpans_ {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

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
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void test_calculateSpans_() {
        // Arrange
        int[] prices = new int[]{10};
        onlineStockSpan = new OnlineStockSpan();

        // Act
        int[] result = calculateSpans(prices);

        // Assert
        assertEquals(0, Arrays.stream(result).sum());
    }

}