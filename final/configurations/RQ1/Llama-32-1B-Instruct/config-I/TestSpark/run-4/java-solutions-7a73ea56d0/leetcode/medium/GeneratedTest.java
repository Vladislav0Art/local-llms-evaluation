package leetcode.medium;

public class GeneratedTest {

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

    @Test
    public void testNext_SpanOfFirstElementIs2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expectedSpans = {1, 1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
        assertEquals(2, onlineStockSpan.next(prices[2]));
    }

    @Test
    public void testNext_SpanOfFirstElementIs3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {23, 2, 11};
        int[] expectedSpans = {1, 1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
        assertEquals(2, onlineStockSpan.next(prices[2]));
    }

    @Test
    public void testNext_SpanOfFirstElementIs4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 5};
        int[] expectedSpans = {1, 1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
        assertEquals(2, onlineStockSpan.next(prices[2]));
    }

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

    @Test
    public void testNext_SpanOfSecondElementIs5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expectedSpans = {1, 1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
        assertEquals(2, onlineStockSpan.next(prices[2]));
    }

    @Test
    public void testNext_SpanOfFirstAndSecondElementsIs6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4};
        int[] expectedSpans = {1, 1};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(1, onlineStockSpan.next(prices[1]));
    }

    @Test
    public void testNext_SpanOfFirstAndSecondElementsIs5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22};
        int[] expectedSpans = {1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
    }

    @Test
    public void testNext_SpanOfFirstAndSecondElementsIs4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6};
        int[] expectedSpans = {1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
    }

    @Test
    public void testNext_SpanOfAllElementsIs5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expectedSpans = {1, 2, 3};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
        assertEquals(3, onlineStockSpan.next(prices[2]));
    }

    @Test
    public void testNext_SpanOfAllElementsIs4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 22};
        int[] expectedSpans = {1, 2};
        assertEquals(1, onlineStockSpan.next(prices[0]));
        assertEquals(2, onlineStockSpan.next(prices[1]));
    }

}