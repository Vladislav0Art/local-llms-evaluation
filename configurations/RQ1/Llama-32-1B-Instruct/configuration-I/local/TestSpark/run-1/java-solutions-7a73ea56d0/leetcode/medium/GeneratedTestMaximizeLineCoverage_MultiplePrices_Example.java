package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_MultiplePrices_Example {

    @Test
    public void testMaximizeLineCoverage_MultiplePrices_Example() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2}, result); // Span of first element is 2
    }

}