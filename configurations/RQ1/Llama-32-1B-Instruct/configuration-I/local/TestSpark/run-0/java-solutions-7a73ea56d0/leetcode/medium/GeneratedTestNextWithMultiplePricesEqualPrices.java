package leetcode.medium;

public class GeneratedTestNextWithMultiplePricesEqualPrices {

    @Test
    public void testNextWithMultiplePricesEqualPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int[] result = onlineStockSpan.calculateSpans(new int[]{20, 15});
        assertArrayEquals(new int[]{2}, result); // Expected span is [2] for second element
    }

}