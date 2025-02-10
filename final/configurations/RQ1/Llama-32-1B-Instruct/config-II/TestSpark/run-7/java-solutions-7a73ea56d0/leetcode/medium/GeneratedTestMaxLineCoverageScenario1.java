package leetcode.medium;

public class GeneratedTestMaxLineCoverageScenario1 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverageScenario1() throws Exception {
        int[] prices = {5, 4, 3, 2, 1};
        int[] expectedSpans = {2, 3, 2, 1, 1};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(5);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        onlineStockSpan.next(2);
        onlineStockSpan.next(1);

        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}