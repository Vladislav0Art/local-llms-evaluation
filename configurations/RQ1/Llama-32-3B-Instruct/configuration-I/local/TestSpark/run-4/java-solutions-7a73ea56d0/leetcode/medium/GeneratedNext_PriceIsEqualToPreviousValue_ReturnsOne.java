package leetcode.medium;

public class GeneratedNext_PriceIsEqualToPreviousValue_ReturnsOne {

    @Test
    public void next_PriceIsEqualToPreviousValue_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}