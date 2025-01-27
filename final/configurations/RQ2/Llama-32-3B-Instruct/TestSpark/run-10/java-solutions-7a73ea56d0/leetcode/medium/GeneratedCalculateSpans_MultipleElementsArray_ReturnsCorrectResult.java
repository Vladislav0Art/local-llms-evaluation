package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectResult {

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
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectResult() {
        StockSpanCalculator stockSpan = new StockSpanCalculator();
        int[] prices = {10, 20, 30};
        int[] result = stockSpan.calculateSpans(prices);
        assertArraysEqual(new int[]{1, 1, 1}, result);
    }

}