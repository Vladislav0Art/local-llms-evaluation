package leetcode.medium;

public class GeneratedCalculateSpans_EmptyStack_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_EmptyStack_ReturnsCorrectSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {};
        int[] result = solution.calculateSpans(prices);
        assertTrue(result.length == 0);
    }

}