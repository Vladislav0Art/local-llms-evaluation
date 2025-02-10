package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_4_ScenarioTest {

    @Test
    public void testMaximizeLineCoverage_4_ScenarioTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 1, 3};
        int[] expectedSpans = {2, 3, 3};
        onlineStockSpan.list = prices;
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}