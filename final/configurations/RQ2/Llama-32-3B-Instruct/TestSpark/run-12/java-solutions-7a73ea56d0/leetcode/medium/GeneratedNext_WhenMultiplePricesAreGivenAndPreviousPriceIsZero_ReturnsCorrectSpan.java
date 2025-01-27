package leetcode.medium;

public class GeneratedNext_WhenMultiplePricesAreGivenAndPreviousPriceIsZero_ReturnsCorrectSpan {

    @Test
    public void next_WhenMultiplePricesAreGivenAndPreviousPriceIsZero_ReturnsCorrectSpan() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5};

        // when
        for (int price : prices) {
            stockSpan.next(price);
        }

        // then
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(4, result[0]);
    }

}