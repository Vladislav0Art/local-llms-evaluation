package leetcode.medium;

public class GeneratedTestNext_SpanOfSecondElementIs4 {

    @Test
    public void testNext_SpanOfSecondElementIs4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 2};
        int[] expectedSpans = {1, 1, 2, 1};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
        assertEquals(2, onlineStockSpan.next(prices[2]));
        assertEquals(1, onlineStockSpan.next(prices[3]));
    }

}