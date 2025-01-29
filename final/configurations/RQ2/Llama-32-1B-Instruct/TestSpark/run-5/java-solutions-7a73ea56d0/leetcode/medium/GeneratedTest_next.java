package leetcode.medium;

public class GeneratedTest_next {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_next() {
        int[] prices = {1, 2};
        int[] result = onlineStockSpan.next(1);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(0, result[2]);
        assertEquals(2, result[3]);
    }

}