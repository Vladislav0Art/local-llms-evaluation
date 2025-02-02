package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testNext_1() {
        int price = 1;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void testNext_2() {
        int price = 2;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void testNext_3() {
        int price = 5;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(price);
        assertEquals(2, result);
    }

    @Test
    public void testNext_4() {
        int price = 1;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(price);
        assertEquals(0, result);
    }

    @Test
    public void testNext_5() {
        int price = 2;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateSpans_1() {
        int[] prices = {3, 2, 6, 5, 0, 0, 3};
        int[] expected = {1, 1, 2, 2, 3, 4, 4};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSpans_2() {
        int[] prices = {1, 2, 3, 4};
        int[] expected = {0, 1, 2, 3};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSpans_3() {
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSpans_EmptyPrices_1() {
        int[] prices = {};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result);
    }

    @Test
    public void testCalculateSpans_EmptyPrices_2() {
        int[] prices = {10, 20};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result);
    }

}