package leetcode.medium;

public class GeneratedTestCalculateSpans_1 {

    @Test
    public void testCalculateSpans_1() {
        int[] prices = {3, 2, 6, 5, 0, 0, 3};
        int[] expected = {1, 1, 2, 2, 3, 4, 4};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

}