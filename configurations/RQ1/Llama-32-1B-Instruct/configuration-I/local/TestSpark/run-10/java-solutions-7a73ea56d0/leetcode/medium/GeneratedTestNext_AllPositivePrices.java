package leetcode.medium;

public class GeneratedTestNext_AllPositivePrices {

    @Test
    public void testNext_AllPositivePrices() {
        int[] prices = {1, 2, 3};
        int[] result = newOnlineStockSpan().next(prices);
        assertEquals(5, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
        for (int price : prices) {
            assertTrue(result.contains(price));
        }
    }

}