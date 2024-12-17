package leetcode.medium;

public class GeneratedTestNext_MultiplePrices {

    @Test
    public void testNext_MultiplePrices() {
        int[] prices = {1, 2, 3};
        int[] result = newOnlineStockSpan().next(prices);
        assertEquals(1, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
        for (int price : prices) {
            assertTrue(result.contains(price));
        }
    }

}