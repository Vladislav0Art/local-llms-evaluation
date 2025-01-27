package leetcode.medium;

public class GeneratedNext_WithSinglePrice_Returns1 {

    @Test
    public void next_WithSinglePrice_Returns1() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // when
        int result = stockSpan.next(100);

        // then
        assertEquals(1, result);
    }

}