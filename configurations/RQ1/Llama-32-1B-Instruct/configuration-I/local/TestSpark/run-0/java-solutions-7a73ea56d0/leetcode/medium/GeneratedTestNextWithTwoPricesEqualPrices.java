package leetcode.medium;

public class GeneratedTestNextWithTwoPricesEqualPrices {

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