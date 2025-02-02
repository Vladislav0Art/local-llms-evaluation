package leetcode.medium;

public class GeneratedTestNext_GreaterThanPreviousPrice {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testNext_GreaterThanPreviousPrice() {
        int[] prices = {3, 5, 8};
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                stockSpan.next(prices[i + 1]);
            }
        }
        assertEquals(2, stockSpan.next(prices[0]));
    }

}