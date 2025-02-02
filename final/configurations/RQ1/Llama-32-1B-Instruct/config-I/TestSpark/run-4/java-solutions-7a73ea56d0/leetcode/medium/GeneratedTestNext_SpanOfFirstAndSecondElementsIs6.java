package leetcode.medium;

public class GeneratedTestNext_SpanOfFirstAndSecondElementsIs6 {

    @Test
    public void testNext_SpanOfFirstAndSecondElementsIs6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4};
        int[] expectedSpans = {1, 1};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
    }

}