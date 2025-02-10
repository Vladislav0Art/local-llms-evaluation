package leetcode.medium;

public class GeneratedTestMaxLineCoverageScenario5 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverageScenario5() throws Exception {
        int[] prices = {};
        int[] expectedSpans = {};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(9);
        onlineStockSpan.next(8);
        onlineStockSpan.next(7);

        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}