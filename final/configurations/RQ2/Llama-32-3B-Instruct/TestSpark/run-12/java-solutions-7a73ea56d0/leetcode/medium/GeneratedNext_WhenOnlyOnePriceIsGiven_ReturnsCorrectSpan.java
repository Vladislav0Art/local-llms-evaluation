package leetcode.medium;

public class GeneratedNext_WhenOnlyOnePriceIsGiven_ReturnsCorrectSpan {

    @Test
    public void next_WhenOnlyOnePriceIsGiven_ReturnsCorrectSpan() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};

        // when
        for (int price : prices) {
            stockSpan.next(price);
        }

        // then
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}