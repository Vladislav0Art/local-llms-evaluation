package leetcode.medium;

public class GeneratedNext_Price_LowestPriceInList_ReturnsOne {

    @Test
    public void next_Price_LowestPriceInList_ReturnsOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

}