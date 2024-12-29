package leetcode.medium;

public class GeneratedTest_next_20 {

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
    public void test_next_20() {
        // Arrange
        int price = 10;
        int[] prices = new int[]{price};
        for (int i = 1; i < prices.length; i++) {
            onlineStockSpan.next(prices[i - 1]);
        }
        assertArrayEquals(new int[]{0, 1}, calculateSpans(prices));

        onlineStockSpan.next(20);
    }

}