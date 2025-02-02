package leetcode.medium;

public class GeneratedTestNext_SpanOfAllElementsIs5 {

    @Test
    public void testNext_SpanOfAllElementsIs5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expectedSpans = {1, 2, 3};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
        assertEquals(3, onlineStockSpan.next(prices[2]));
    }

}