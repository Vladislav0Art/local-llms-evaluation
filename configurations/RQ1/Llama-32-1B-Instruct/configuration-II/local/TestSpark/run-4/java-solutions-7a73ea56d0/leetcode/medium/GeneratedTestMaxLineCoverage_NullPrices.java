package leetcode.medium;

public class GeneratedTestMaxLineCoverage_NullPrices {

    @Test
    public void testMaxLineCoverage_NullPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertThrowsNullPointerException::isInstance;
        onlineStockSpan.calculateSpans(null);
    }

}