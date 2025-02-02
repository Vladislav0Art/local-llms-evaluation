package leetcode.medium;

public class GeneratedTestCalculateSpans_2 {

    @Test
    public void testCalculateSpans_2() {
        int[] prices = {1, 2, 3, 4};
        int[] expected = {0, 1, 2, 3};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

}