package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_SinglePrice {

    @Test
    public void testMaximizeLineCoverage_SinglePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {1};

        int[] result = onlineStockSpan.calculateSpans(prices);

        assertEquals(1, result[0]);
    }

}