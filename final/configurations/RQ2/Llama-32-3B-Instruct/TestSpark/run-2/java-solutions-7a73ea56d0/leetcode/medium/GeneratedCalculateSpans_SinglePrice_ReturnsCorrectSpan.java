package leetcode.medium;

public class GeneratedCalculateSpans_SinglePrice_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SinglePrice_ReturnsCorrectSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}