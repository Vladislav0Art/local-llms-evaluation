package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_3_ScenarioTest {

    @Test
    public void testMaximizeLineCoverage_3_ScenarioTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 2, 6};
        int[] expectedSpans = {1, 1, 2, 3};
        onlineStockSpan.list = prices;
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}