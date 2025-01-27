package leetcode.medium;

public class GeneratedCalculateSpans_WhenOnlyOnePriceIsGiven_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_WhenOnlyOnePriceIsGiven_ReturnsCorrectSpan() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, result[0]);
    }

}