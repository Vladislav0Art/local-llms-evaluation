package leetcode.medium;

public class GeneratedNext_PriceIsHigherThanAllPreviousValues_ReturnsLengthOfList {

    @Test
    public void next_PriceIsHigherThanAllPreviousValues_ReturnsLengthOfList() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(100 + i);
        }
        int result = onlineStockSpan.next(100);
        assertEquals(10, result);
    }

}