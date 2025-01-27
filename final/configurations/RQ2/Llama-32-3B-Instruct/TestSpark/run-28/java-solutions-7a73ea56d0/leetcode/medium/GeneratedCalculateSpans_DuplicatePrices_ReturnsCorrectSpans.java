package leetcode.medium;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        // given
        int[] prices = {100, 80, 60};
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}