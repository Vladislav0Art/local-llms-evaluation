package leetcode.medium;

public class GeneratedTestMaxLineCoverageScenario4 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverageScenario4() throws Exception {
        int[] prices = {10, 9, 8, 7, 6};
        int[] expectedSpans = {2, 1, 0, 0};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(9);
        onlineStockSpan.next(8);
        onlineStockSpan.next(7);

        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}