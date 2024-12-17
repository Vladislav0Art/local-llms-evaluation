package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testCalculateSpansNoPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void testNextWithPriceLessThanCurrentPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        int[] result = onlineStockSpan.calculateSpans(new int[]{2, 4, 10});
        assertArrayEquals(new int[]{2, 1}, result); // Expected spans are [2], [1]
    }

    @Test
    public void testNextWithPriceEqualToCurrentPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 10});
        assertArrayEquals(new int[]{1}, result); // Expected span is [1] for second element
    }

    @Test
    public void testNextWithPriceGreaterThanCurrentPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(15);
        int[] result = onlineStockSpan.calculateSpans(new int[]{12, 20});
        assertArrayEquals(new int[]{2}, result); // Expected span is [2] for second element
    }

    @Test
    public void testNextWithMultiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int[] result = onlineStockSpan.calculateSpans(new int[]{20, 15, 25});
        assertArrayEquals(new int[]{2, 1}, result); // Expected spans are [2], [1]
    }

    @Test
    public void testNextWithTwoPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(15);
        int[] result = onlineStockSpan.calculateSpans(new int[]{5, 20});
        assertArrayEquals(new int[]{3}, result); // Expected span is [3]
    }

    @Test
    public void testNextWithMultiplePricesEqualPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int[] result = onlineStockSpan.calculateSpans(new int[]{20, 15});
        assertArrayEquals(new int[]{2}, result); // Expected span is [2] for second element
    }

    @Test
    public void testNextWithTwoPricesEqualPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        int[] result = onlineStockSpan.calculateSpans(new int[]{20, 20});
        assertArrayEquals(new int[]{1}, result); // Expected span is [1] for second element
    }

}