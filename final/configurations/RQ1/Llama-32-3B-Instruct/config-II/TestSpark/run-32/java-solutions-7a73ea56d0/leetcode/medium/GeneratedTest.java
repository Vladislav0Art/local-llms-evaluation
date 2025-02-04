package leetcode.medium;

public class GeneratedTest {

    @Test
    public void next_Price_EmptyList_ReturnsZero() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertEquals(0, result);
    }

    @Test
    public void next_Price_LowestPriceInList_ReturnsOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void next_Price_LowestPriceInList_ReturnsOneForSecondLowest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        int result = stockSpan.next(25);
        assertEquals(1, result);
    }

    @Test
    public void next_Price_MultipleDecreases_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1000);
        stockSpan.next(900);
        stockSpan.next(800);
        int result = stockSpan.next(700);
        assertEquals(4, result);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[0]);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}