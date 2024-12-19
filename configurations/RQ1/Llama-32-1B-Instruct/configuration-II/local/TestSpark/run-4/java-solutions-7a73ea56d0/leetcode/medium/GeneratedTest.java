package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage_SimpleScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testMaxLineCoverage_SmallScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void testMaxLineCoverage_NullPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertThrowsNullPointerException::isInstance;
        onlineStockSpan.calculateSpans(null);
    }

    @Test
    public void testMaxLineCoverage_EmptyListScenario() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertThrowsNullPointerException::isInstance;
        onlineStockSpan.calculateSpans(prices);
    }

}