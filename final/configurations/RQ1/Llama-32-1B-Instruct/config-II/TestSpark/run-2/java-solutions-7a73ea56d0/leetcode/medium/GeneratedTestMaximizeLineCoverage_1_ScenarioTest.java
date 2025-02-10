package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_1_ScenarioTest {

    @Test
    public void testMaximizeLineCoverage_1_ScenarioTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3, 1};
        int[] expectedSpans = {1, 2, 2, 1, 1};
        onlineStockSpan.list = prices;
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}