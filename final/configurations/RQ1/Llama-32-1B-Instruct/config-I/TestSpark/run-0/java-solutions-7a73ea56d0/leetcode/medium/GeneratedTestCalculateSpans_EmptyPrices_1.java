package leetcode.medium;

public class GeneratedTestCalculateSpans_EmptyPrices_1 {

    @Test
    public void testCalculateSpans_EmptyPrices_1() {
        int[] prices = {};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result);
    }

}