package leetcode.medium;

public class GeneratedTestNext_SpanOfAllElementsIs4 {

    @Test
    public void testNext_SpanOfAllElementsIs4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22};
        int[] expectedSpans = {1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
    }

}