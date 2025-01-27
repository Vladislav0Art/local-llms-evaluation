package leetcode.medium;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

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
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        StockSpanCalculator stockSpan = new StockSpanCalculator();
        int[] prices = {};
        int[] result = stockSpan.calculateSpans(prices);
        assertArraysEqual(new int[]{}, result);
    }

}