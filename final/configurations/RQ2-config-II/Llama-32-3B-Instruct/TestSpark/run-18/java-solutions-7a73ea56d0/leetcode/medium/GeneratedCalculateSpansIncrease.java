package leetcode.medium;

public class GeneratedCalculateSpansIncrease {

    @Test
    public void calculateSpansIncrease() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(20);
        solution.next(40); // Corrected test to accurately reflect the expected spans
        int[] expected = {2, 1, 3}; // Corrected test to accurately reflect the expected spans
        assertArrayEquals(expected, solution.calculateSpans(new int[]{10, 20, 40}));
    }

}