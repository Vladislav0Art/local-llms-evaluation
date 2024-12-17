package leetcode.medium;

public class GeneratedCalculateSpans_PriceArrayHasMultipleElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PriceArrayHasMultipleElements_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(100 + i);
        }
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 150, 50, 200});
        assertArrayEquals(new int[]{2, 1, 3, 5}, result);
    }

}