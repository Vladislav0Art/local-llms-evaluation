package leetcode.medium;

public class GeneratedTestNext_SpanOfFirstElementIs1 {

    @Test
    public void testNext_SpanOfFirstElementIs1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4, 3};
        int[] expectedSpans = {1};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        for (int i : expectedSpans) {
            assertEquals(i, onlineStockSpan.next(prices[i]));
        }
    }

}