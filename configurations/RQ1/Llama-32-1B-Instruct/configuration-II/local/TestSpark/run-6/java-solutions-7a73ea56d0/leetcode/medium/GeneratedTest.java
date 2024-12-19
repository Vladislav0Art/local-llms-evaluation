package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3, 1};
        int[] expectedSpans = {1, 1, 2, 1, 2};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20};
        int[] expectedSpans = {1, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 3000, 15, 127, 40};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage_4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1000};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage_6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testMaxLineCoverage_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}