package leetcode.medium;

public class GeneratedTest {

    public int next(int price) {
        // implementation...
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        // implementation...
        int[] result = new int[prices.length];
        Arrays.fill(result, 0);
        return result;
    }
}

public class GeneratedTest {

    @Test
    public void next_0_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void next_PositvePrice_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void next_NegativePrice_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(-5);
        assertEquals(1, result);
    }

}