package leetcode.medium;

public class GeneratedNext_PriceIsLowerThanAllPreviousValues_ReturnsOne {

    @Test
    public void next_PriceIsLowerThanAllPreviousValues_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}