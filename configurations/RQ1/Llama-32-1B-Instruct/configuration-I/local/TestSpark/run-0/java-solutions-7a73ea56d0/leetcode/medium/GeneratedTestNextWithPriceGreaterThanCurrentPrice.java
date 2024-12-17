package leetcode.medium;

public class GeneratedTestNextWithPriceGreaterThanCurrentPrice {

    @Test
    public void testNextWithPriceGreaterThanCurrentPrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(15);
        int[] result = onlineStockSpan.calculateSpans(new int[]{12, 20});
        assertArrayEquals(new int[]{2}, result); // Expected span is [2] for second element
    }

}