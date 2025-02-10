package leetcode.medium;

public class GeneratedTestMaxLineCoverageScenario3 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverageScenario3() throws Exception {
        int[] prices = {10, 9, 8, 7, 6, 5, 4, 3};
        int[] expectedSpans = {3, 3, 2, 1, 1, 1, 1, 1};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(10);
        onlineStockSpan.next(9);
        onlineStockSpan.next(8);
        onlineStockSpan.next(7);
        onlineStockSpan.next(6);
        onlineStockSpan.next(5);

        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}