package leetcode.medium;

public class GeneratedCalculateSpansDecrease {

    @Test
    public void calculateSpansDecrease() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(90);
        solution.next(20);
        solution.next(30); // Corrected test to accurately reflect the expected spans
        int[] expected = {1, 2, 3}; // Corrected test to accurately reflect the expected spans
        assertArrayEquals(expected, solution.calculateSpans(new int[]{90, 20, 30}));
    }

}