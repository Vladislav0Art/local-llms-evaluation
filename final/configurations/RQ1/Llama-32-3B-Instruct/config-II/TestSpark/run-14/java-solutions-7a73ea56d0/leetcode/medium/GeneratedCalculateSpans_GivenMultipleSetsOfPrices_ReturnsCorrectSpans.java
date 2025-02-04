package leetcode.medium;

public class GeneratedCalculateSpans_GivenMultipleSetsOfPrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_GivenMultipleSetsOfPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices1 = {100, 80, 75, 60};
        int[] prices2 = {110, 120, 130, 140};

        // When
        for (int i = 0; i < prices1.length; i++) {
            onlineStockSpan.next(prices1[i]);
        }
        for (int i = 0; i < prices2.length; i++) {
            onlineStockSpan.next(prices2[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(new int[]{});

        // Then
        assertTrue(spans == null);
    }

}