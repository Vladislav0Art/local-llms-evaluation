package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_5_ScenarioTest {

    @Test
    public void testMaximizeLineCoverage_5_ScenarioTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] expectedSpans = {};
        onlineStockSpan.list = prices;
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        onlineStockSpan.next(4);
        onlineStockSpan.next(5);
        onlineStockSpan.next(6);
        onlineStockSpan.next(7);
        onlineStockSpan.next(8);
        onlineStockSpan.next(9);
        onlineStockSpan.next(10);

        List<Integer> spans = new ArrayList<>();
        for (int i : prices) {
            spans.add(i);
        }

        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}