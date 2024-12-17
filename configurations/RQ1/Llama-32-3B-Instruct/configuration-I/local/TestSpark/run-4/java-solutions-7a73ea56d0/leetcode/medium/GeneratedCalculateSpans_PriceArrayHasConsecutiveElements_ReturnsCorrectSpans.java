package leetcode.medium;

public class GeneratedCalculateSpans_PriceArrayHasConsecutiveElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PriceArrayHasConsecutiveElements_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(100 + i);
        }
        int[] result = onlineStockSpan.calculateSpans(new int[]{99, 100, 101, 102});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}