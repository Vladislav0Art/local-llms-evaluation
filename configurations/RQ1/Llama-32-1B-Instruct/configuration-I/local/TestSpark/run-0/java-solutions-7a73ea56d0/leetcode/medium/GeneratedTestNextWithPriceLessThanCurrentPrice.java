package leetcode.medium;

public class GeneratedTestNextWithPriceLessThanCurrentPrice {

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

}