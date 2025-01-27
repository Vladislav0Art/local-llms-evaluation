package leetcode.medium;

public class GeneratedStockSpanIsZeroWhenPriceIsNegativeOrZero {

    private int next;

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = calculateSpan(prices[i]);
        }
        return result;
    }

    private int calculateSpan(int price) {
        if (next == 0) {
            next = 1;
        } else {
            next++;
        }
        return next;
    }
}

public class GeneratedTest {

    @Test
    public void stockSpanIsZeroWhenPriceIsNegativeOrZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{-1, -2, 0});
        assertEquals(0, Arrays.stream(result).min().getAsInt());
    }

}