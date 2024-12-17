package leetcode.medium;

public class GeneratedCalculateSpans_PriceArrayHasDecreasingConsecutiveElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PriceArrayHasDecreasingConsecutiveElements_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(100 + i);
        }
        int[] result = onlineStockSpan.calculateSpans(new int[]{101, 99, 98, 96});
        assertArrayEquals(new int[]{2, 1, 3, 5}, result);
    }

}