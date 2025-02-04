package leetcode.medium;

public class GeneratedNext_Price_LowestPriceInList_ReturnsOneForSecondLowest {

    @Test
    public void next_Price_LowestPriceInList_ReturnsOneForSecondLowest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        int result = stockSpan.next(25);
        assertEquals(1, result);
    }

}