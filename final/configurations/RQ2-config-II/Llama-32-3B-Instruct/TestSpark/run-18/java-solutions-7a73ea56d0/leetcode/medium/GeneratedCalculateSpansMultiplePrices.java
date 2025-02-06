package leetcode.medium;

public class GeneratedCalculateSpansMultiplePrices {

    @Test
    public void calculateSpansMultiplePrices() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(20);
        solution.next(30);
        int[] expected = {2, 1, 1};
        assertArrayEquals(expected, solution.calculateSpans(new int[]{10, 20, 30}));
    }

}