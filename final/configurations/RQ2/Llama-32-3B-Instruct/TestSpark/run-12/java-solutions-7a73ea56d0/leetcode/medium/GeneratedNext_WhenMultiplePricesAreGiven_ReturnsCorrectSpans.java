package leetcode.medium;

public class GeneratedNext_WhenMultiplePricesAreGiven_ReturnsCorrectSpans {

    @Test
    public void next_WhenMultiplePricesAreGiven_ReturnsCorrectSpans() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        for (int price : prices) {
            stockSpan.next(price);
        }

        // then
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(5, result[0]);
    }

}