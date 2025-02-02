package leetcode.medium;

public class GeneratedTestCalculateSpans_3 {

    @Test
    public void testCalculateSpans_3() {
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

}