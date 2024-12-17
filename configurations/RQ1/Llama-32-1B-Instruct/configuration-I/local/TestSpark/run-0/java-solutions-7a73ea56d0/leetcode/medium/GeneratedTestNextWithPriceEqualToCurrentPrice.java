package leetcode.medium;

public class GeneratedTestNextWithPriceEqualToCurrentPrice {

    @Test
    public void testNextWithPriceEqualToCurrentPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 10});
        assertArrayEquals(new int[]{1}, result); // Expected span is [1] for second element
    }

}