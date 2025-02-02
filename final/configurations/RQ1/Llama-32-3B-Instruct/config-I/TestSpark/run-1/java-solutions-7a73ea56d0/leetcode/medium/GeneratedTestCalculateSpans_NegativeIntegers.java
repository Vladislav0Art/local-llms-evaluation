package leetcode.medium;

public class GeneratedTestCalculateSpans_NegativeIntegers {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_NegativeIntegers() {
        int[] prices = {-100, -80, -75, -70, -60, -70};
        for (int price : prices) {
            stockSpan.reset();
            assertEquals(1, stockSpan.next(price));
        }
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            stockSpan.next(prices[i]);
            if (i + 1 < prices.length) {
                stockSpan.next(prices[i + 1]);
            } else {
                stockSpan.next(0);
            }
        }
        assertEquals(expected, stockSpan.calculateSpans());
    }

}