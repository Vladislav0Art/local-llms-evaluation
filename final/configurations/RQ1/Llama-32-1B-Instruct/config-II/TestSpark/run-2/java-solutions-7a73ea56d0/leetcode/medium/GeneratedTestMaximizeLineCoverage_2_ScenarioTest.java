package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_2_ScenarioTest {

    @Test
    public void testMaximizeLineCoverage_2_ScenarioTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expectedSpans = {1, 2, 4};
        onlineStockSpan.list = prices;
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}