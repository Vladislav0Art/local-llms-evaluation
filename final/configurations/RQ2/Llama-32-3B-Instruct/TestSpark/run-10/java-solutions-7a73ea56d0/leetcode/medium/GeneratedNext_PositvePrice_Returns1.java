package leetcode.medium;

public class GeneratedNext_PositvePrice_Returns1 {

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
    public void next_PositvePrice_Returns1() {
        StockSpanCalculator stockSpan = new StockSpanCalculator();
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

}