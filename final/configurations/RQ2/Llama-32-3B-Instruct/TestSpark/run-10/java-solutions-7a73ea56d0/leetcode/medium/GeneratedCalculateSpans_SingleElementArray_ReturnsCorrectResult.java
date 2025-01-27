package leetcode.medium;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectResult {

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
    public void calculateSpans_SingleElementArray_ReturnsCorrectResult() {
        StockSpanCalculator stockSpan = new StockSpanCalculator();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertArraysEqual(new int[]{1}, result);
    }

}