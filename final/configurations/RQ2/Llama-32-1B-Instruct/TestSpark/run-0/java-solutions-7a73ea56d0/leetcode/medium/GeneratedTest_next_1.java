package leetcode.medium;

public class GeneratedTest_next_1 {

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
    public void test_next_1() {
        // Arrange
        int price = 5;
        int[] prices = new int[]{price};
        assertArrayEquals(new int[]{0}, calculateSpans(prices));

        onlineStockSpan.next(price);
    }

}