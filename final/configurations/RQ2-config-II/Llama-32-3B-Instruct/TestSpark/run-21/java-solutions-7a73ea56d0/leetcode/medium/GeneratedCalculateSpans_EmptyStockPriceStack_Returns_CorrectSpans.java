package leetcode.medium;

public class GeneratedCalculateSpans_EmptyStockPriceStack_Returns_CorrectSpans {

    @Test
    public void calculateSpans_EmptyStockPriceStack_Returns_CorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{1, 2, 3, 4});
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
    }

}