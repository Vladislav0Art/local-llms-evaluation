package leetcode.medium;

public class GeneratedTest_next_2 {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_next_2() {
        int[] prices = {1};
        int[] result = onlineStockSpan.next(1);
        assertEquals(-1, result[0]);
        assertEquals(1, result[1]);
    }

}