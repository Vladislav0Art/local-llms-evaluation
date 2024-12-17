package leetcode.medium;

public class GeneratedCalculateSpans_PriceArrayHasIncreaseDecreaseSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PriceArrayHasIncreaseDecreaseSequence_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(100 + i);
        }
        int[] result = onlineStockSpan.calculateSpans(new int[]{99, 101, 102, 98});
        assertArrayEquals(new int[]{1, 2, 4, 3}, result);
    }

}