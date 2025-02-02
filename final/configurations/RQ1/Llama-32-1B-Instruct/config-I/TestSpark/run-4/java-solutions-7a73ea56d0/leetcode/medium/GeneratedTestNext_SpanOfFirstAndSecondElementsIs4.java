package leetcode.medium;

public class GeneratedTestNext_SpanOfFirstAndSecondElementsIs4 {

    @Test
    public void testNext_SpanOfFirstAndSecondElementsIs4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6};
        int[] expectedSpans = {1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
    }

}