package leetcode.medium;

public class GeneratedTestNextWithMultiplePrices {

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

}