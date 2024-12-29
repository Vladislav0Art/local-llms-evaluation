package leetcode.medium;

public class GeneratedTest {

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

    @Test
    public void test_next_10() {
        // Arrange
        int price = 10;
        int[] prices = new int[]{price};
        for (int i = 1; i < prices.length; i++) {
            onlineStockSpan.next(prices[i - 1]);
        }
        assertArrayEquals(new int[]{0, 1}, calculateSpans(prices));

        onlineStockSpan.next(price);
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

    @Test
    public void test_next_30() {
        // Arrange
        int price = 10;
        int[] prices = new int[]{price};
        for (int i = 1; i < prices.length; i++) {
            onlineStockSpan.next(prices[i - 1]);
        }
        assertArrayEquals(new int[]{0, 1}, calculateSpans(prices));

        onlineStockSpan.next(30);
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

    @Test
    public void test_calculateSpans_singleElementArray() {
        // Arrange
        OnlineStockSpan.onlineStock = new OnlineStockSpan();

        // Act
        OnlineStockSpan.onlineStock.calculateSpans(new int[]{10});

        // Assert
        assertArrayEquals(new int[]{0}, calculateSpans(new int[]{10}));
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