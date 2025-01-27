package leetcode.medium;

public class GeneratedStockSpanDoesNotIncreaseWhenPriceDecreases {

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
    public void stockSpanDoesNotIncreaseWhenPriceDecreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 0, -1});
        assertEquals(Arrays.asList(1, 1, 2), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

}