package leetcode.medium;

public class GeneratedTest {

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

    @Test
    public void test_next_2() {
        int[] prices = {1};
        int[] result = onlineStockSpan.next(1);
        assertEquals(-1, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void test_calculateSpans() {
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {15, 17, 31, 24, 10};
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
        assertEquals(expected[0], result[0]);
        assertEquals(1, result[1]);
        assertEquals(4, result[2]);
        assertEquals(24, result[3]);
    }

    @Test
    public void test_calculateSpans_2() {
        int[] prices = {5};
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
        assertEquals(1, result[0]);
    }

    @Test
    public void test_calculateSpans_3() {
        int[] prices = {4, 2};
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
        assertEquals(3, result[0]);
    }

    @Test
    public void test_calculateSpans_4() {
        int[] prices = {1, 2};
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        java.util.Arrays.sort(result);
    }

}