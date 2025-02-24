package leetcode.medium;

public class GeneratedNextWhenPriceHigherThanPrecedingPrices {

    @Test
    public void nextWhenPriceHigherThanPrecedingPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(120));
        assertEquals(3, stockSpan.next(150));
    }

}