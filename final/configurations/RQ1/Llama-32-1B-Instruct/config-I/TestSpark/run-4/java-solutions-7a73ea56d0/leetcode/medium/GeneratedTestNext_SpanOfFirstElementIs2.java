package leetcode.medium;

public class GeneratedTestNext_SpanOfFirstElementIs2 {

    @Test
    public void testNext_SpanOfFirstElementIs2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expectedSpans = {1, 1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
        assertEquals(2, onlineStockSpan.next(prices[2]));
    }

}