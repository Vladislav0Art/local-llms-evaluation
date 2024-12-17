package leetcode.medium;

public class GeneratedTestNext_AllNegativePrices {

    @Test
    public void testNext_AllNegativePrices() {
        int[] prices = {-100, -200};
        int[] result = newOnlineStockSpan().next(prices);
        assertEquals(2, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
    }

}