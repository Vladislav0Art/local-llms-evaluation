package leetcode.medium;

public class GeneratedNext_WhenPriceIsZero_ReturnsOne {

    @Test
    public void next_WhenPriceIsZero_ReturnsOne() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 0;

        // when
        int result = stockSpan.next(price);

        // then
        assertEquals(1, result);
    }

}