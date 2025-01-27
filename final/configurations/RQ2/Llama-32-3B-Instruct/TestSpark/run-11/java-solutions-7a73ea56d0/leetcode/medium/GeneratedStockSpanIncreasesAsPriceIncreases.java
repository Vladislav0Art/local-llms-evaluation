package leetcode.medium;

public class GeneratedStockSpanIncreasesAsPriceIncreases {

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
    public void stockSpanIncreasesAsPriceIncreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 3, 5});
        assertEquals(Arrays.asList(2, 3, 4), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

}