package leetcode.medium;

public class GeneratedTest {

    @Test
    public void nextWhenPriceHigherThanPrecedingPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(120));
        assertEquals(3, stockSpan.next(150));
    }

    @Test
    public void nextWhenPriceLowerThanPrecedingPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(1, stockSpan.next(90));
        assertEquals(1, stockSpan.next(80));
    }

    @Test
    public void nextWhenPriceEqualsPrecedingPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(100));
        assertEquals(3, stockSpan.next(100));
    }

    @Test
    public void calculateSpansWhenInputArrayIsEmpty() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[0], stockSpan.calculateSpans(new int[0]));
    }

    @Test
    public void calculateSpansWhenInputArrayHasOneElement() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[]{1}, stockSpan.calculateSpans(new int[]{100}));
    }

}