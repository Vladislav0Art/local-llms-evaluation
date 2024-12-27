package leetcode.medium;

public class GeneratedNext_DifferentPrices_ReturnsCorrectSpans {

    @Test
    public void next_DifferentPrices_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = {2, 4, 3};
        for (int i = 0; i < result.length - 1; i++) {
            assertEquals(result[i + 1] - result[i], instance.next(i));
        }
    }

}