package leetcode.medium;

public class GeneratedNextWhenPriceEqualsPrecedingPrices {

    @Test
    public void nextWhenPriceEqualsPrecedingPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(100));
        assertEquals(3, stockSpan.next(100));
    }

}