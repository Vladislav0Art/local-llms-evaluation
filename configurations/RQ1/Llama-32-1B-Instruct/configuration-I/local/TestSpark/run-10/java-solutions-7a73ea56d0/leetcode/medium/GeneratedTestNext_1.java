package leetcode.medium;

public class GeneratedTestNext_1 {

    @Test
    public void testNext_1() {
        int price = 100;
        int[] result = newOnlineStockSpan().next(price);
        assertEquals(0, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
    }

}