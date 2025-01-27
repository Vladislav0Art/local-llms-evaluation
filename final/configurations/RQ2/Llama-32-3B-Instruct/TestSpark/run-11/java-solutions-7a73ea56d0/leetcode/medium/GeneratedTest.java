package leetcode.medium;

public class GeneratedTest {

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

    @Test
    public void stockSpanIsOneWhenPriceIsPositive() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 2, 3});
        assertEquals(1, Arrays.stream(result).max().getAsInt());
    }

    @Test
    public void stockSpanIncreasesAsPriceIncreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 3, 5});
        assertEquals(Arrays.asList(2, 3, 4), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

    @Test
    public void stockSpanDoesNotIncreaseWhenPriceDecreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 0, -1});
        assertEquals(Arrays.asList(1, 1, 2), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

    @Test
    public void stockSpanDoesNotIncreaseWhenPriceIsZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{0});
        assertEquals(1, result[0]);
    }

    @Test
    public void stockSpanIncreasesForAllPrices() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 2, 3, 4, 5});
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

}