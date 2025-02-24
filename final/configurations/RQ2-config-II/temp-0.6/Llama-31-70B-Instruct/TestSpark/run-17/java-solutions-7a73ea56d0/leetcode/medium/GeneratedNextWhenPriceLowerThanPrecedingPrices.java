package leetcode.medium;

public class GeneratedNextWhenPriceLowerThanPrecedingPrices {

    @Test
    public void nextWhenPriceLowerThanPrecedingPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(1, stockSpan.next(90));
        assertEquals(1, stockSpan.next(80));
    }

}