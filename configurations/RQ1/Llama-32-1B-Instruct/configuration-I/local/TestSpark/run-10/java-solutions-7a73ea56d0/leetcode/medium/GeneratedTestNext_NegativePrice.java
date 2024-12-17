package leetcode.medium;

public class GeneratedTestNext_NegativePrice {

    @Test
    public void testNext_NegativePrice() {
        int price = -100;
        int[] result = newOnlineStockSpan().next(price);
        assertEquals(0, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
    }

}