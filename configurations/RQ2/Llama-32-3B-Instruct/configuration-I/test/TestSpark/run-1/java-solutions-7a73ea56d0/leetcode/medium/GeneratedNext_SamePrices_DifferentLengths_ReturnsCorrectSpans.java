package leetcode.medium;

public class GeneratedNext_SamePrices_DifferentLengths_ReturnsCorrectSpans {

    @Test
    public void next_SamePrices_DifferentLengths_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 125};
        int[] result = {3, 2, 1, 4};
        for (int i = 0; i < result.length - 1; i++) {
            assertEquals(result[i + 1] - result[i], instance.next(i));
        }
    }

}