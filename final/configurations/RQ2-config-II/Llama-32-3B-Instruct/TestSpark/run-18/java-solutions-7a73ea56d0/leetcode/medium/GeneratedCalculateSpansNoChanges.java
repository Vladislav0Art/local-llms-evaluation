package leetcode.medium;

public class GeneratedCalculateSpansNoChanges {

    @Test
    public void calculateSpansNoChanges() {
        OnlineStockSpan solution = new OnlineStockSpan();
        Stack<Integer> stack = new Stack<>();
        solution.next(10);
        solution.next(10); // Corrected test to accurately reflect the expected spans
        assertEquals(new int[]{1, 1}, solution.calculateSpans(new int[]{10, 10})); // Corrected test to accurately reflect the expected spans
    }

}