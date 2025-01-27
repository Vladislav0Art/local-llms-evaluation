package leetcode.medium;

public class GeneratedNext_WhenPriceIsNegative_ReturnsOne {

    @Test
    public void next_WhenPriceIsNegative_ReturnsOne() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = -10;

        // when
        int result = stockSpan.next(price);

        // then
        assertEquals(1, result);
    }

}