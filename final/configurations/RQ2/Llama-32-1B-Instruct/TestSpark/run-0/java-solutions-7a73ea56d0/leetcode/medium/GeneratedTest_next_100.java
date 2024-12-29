package leetcode.medium;

public class GeneratedTest_next_100 {

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
    public void test_next_100() {
        // Arrange
        int price = 2;
        int[] prices = new int[]{price};
        for (int i = 0; i < 99; i++) {
            onlineStockSpan.next(1);
        }
        onlineStockSpan.next(price);

        // Act and Assert
        assertEquals(100, onlineStockSpan.next(price));
    }

}