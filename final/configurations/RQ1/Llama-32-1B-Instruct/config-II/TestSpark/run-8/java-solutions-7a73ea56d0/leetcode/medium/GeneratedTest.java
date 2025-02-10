package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] expectedSpans = {1, 1, 2, 1, 2, 1};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

    @Test
    public void testMaxLineCoverage_EmptyPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

    @Test
    public void testMaxLineCoverage_ZeroPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {0, 1, 2};
        int[] expectedSpans = {};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

    @Test
    public void testMaxLineCoverage_SingleElementPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5};
        int[] expectedSpans = {};
        int actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans.length, actualSpans.length);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(actualSpans[i], expectedSpans[i]);
        }
    }

}