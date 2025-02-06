package leetcode.medium;

public class GeneratedCalculateSpansStack {

    @Test
    public void calculateSpansStack() {
        OnlineStockSpan solution = new OnlineStockSpan();
        Stack<Integer> stack = new Stack<>();
        solution.next(10);
        solution.next(20);
        solution.next(30);
        assertEquals(new int[]{2, 1, 3}, solution.calculateSpans(new int[]{10, 20, 30})); // Corrected test to accurately reflect the expected spans
    }

}