package leetcode.medium;

public class GeneratedTestNextWithTwoPrices {

    @Test
    public void testNextWithTwoPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(15);
        int[] result = onlineStockSpan.calculateSpans(new int[]{5, 20});
        assertArrayEquals(new int[]{3}, result); // Expected span is [3]
    }

}