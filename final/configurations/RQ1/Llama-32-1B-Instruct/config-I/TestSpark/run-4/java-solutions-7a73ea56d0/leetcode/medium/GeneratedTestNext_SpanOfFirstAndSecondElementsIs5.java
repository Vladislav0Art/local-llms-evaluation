package leetcode.medium;

public class GeneratedTestNext_SpanOfFirstAndSecondElementsIs5 {

    @Test
    public void testNext_SpanOfFirstAndSecondElementsIs5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22};
        int[] expectedSpans = {1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
    }

}